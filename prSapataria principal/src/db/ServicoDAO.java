package db;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Classes.Sapato;
import Classes.TipoSapato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuelson
 */
public class ServicoDAO {
    private ServicoConexao conexao = new ServicoConexao();
    
    public boolean insert(Sapato p) {
        
        String sql = "insert into clientes(COD_SAPATO, COD_CLIENTE, COD_TIPO_SAPATO, NUMERO, MARCA, COR, CONSERTO, VALOR)" +
            "values (0,?,?,?,?,?,?,?)";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setInt(1, p.getCodCliente());
                ps.setInt(2, p.getCodTipoSapato());
                ps.setInt(3, p.getNumSapato());
                ps.setString(4, p.getMarca());
                ps.setString(5, p.getCor());
                ps.setString(6, p.getConserto());
                ps.setFloat(7, p.getValor());
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (SQLException e) {
                return false;
            }

    }

    public List<TipoSapato> readTipoSapato() {

        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<TipoSapato> tipoSapatos = new ArrayList<>();
        String sql = "select * from tipos_sapato";
        try {
            stmt = conexao.getConexao().prepareStatement(sql);;
            rs = stmt.executeQuery();

            while (rs.next()) {

                TipoSapato tipoSapato = new TipoSapato();

                tipoSapato.setCodTipoSapato(rs.getInt("COD_TIPO_SAPATO"));
                tipoSapato.setNomeTipoSapato(rs.getString("NOME_TIPO_SAPATO"));
                tipoSapatos.add(tipoSapato);
            }
            return tipoSapatos;
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           conexao.close();
        }

        return tipoSapatos;
    }
    
    public void update(Sapato p) {

        ServicoConexao con = (ServicoConexao) conexao.getConexao();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.getConexao().prepareStatement(
                    "UPDATE sapato SET "
                   + "COD_TIPO_SAPATO = ? ,"
                   + "NUMERO = ?,"
                   + "MARCA = ? "
                   + "COR = ? "
                   + "CONSERTO = ? "
                   + "VALOR = ? "            
                   + "WHERE COD_SAPATO = ?");
            stmt.setInt(1, p.getCodTipoSapato());    
            stmt.setInt(2, p.getNumSapato());
            stmt.setString(3, p.getMarca());
            stmt.setString(4, p.getCor());
            stmt.setString(5, p.getConserto());
            stmt.setFloat(6, p.getValor());
            stmt.setInt(7, p.getCodSapato());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            conexao.close();
        }

    }
    public void delete(Sapato p) {

        ServicoConexao con = (ServicoConexao) conexao.getConexao();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.getConexao().prepareStatement("DELETE sapato produto WHERE COD_SAPATO = ?");
            stmt.setInt(1, p.getCodSapato());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            conexao.getConexao();
        }

    }

}