package db;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Classes.CorSapato;
import Classes.Sapato;
import Classes.TipoSapato;
import Utilitarios.Utilitarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuelson
 */
public class ServicoDAO {
    private ServicoConexao conexao = new ServicoConexao();
    private Utilitarios utilit = new Utilitarios();
    
    public boolean insertSapato(Sapato p) {
        
        String sql = "insert into sapato values (0,?,?,?,?,?,?,?);";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setInt(1, p.getCodCliente());
                ps.setInt(2, p.getCodTipoSapato());
                ps.setInt(3, p.getNumSapato());
                ps.setString(4, p.getMarca());
                ps.setString(5, p.getCodCorSapato());
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
            stmt = conexao.getConexao().prepareStatement(sql);
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
    
    public List<CorSapato> readCorSapato() {

        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<CorSapato> corSapatos = new ArrayList<>();
        String sql = "select * from cor";
        try {
            stmt = conexao.getConexao().prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                CorSapato corSapato = new CorSapato();

                corSapato.setCodCorSapato(rs.getInt("COD_COR_SAPATO"));
                corSapato.setNomeCorSapato(rs.getString("NOME_COR_SAPATO"));
                corSapatos.add(corSapato);
            }
            return corSapatos;
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           conexao.close();
        }

        return corSapatos;
    }
    
    public List<Sapato> readSapato(Integer codcliente) {

        PreparedStatement stmt = null;
        ResultSet rs = null;


        List<Sapato> sapatos = new ArrayList<>();
        String sql = "select a.COD_SAPATO, b.NOME_TIPO_SAPATO,c.NOME_COR_SAPATO, a.NUMERO, a.COR, a.MARCA, a.CONSERTO, a.VALOR "
                     + "from sapato a, tipos_sapato b, cor_sapato c "
                       + "where a.COD_TIPO_SAPATO = b.COD_TIPO_SAPATO"
                         + "and a.COD_COR_SAPATO = c.COD_COR_SAPATO  "
                         + "and a.COD_CLIENTE = ?";
        try {
            stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, codcliente);
            rs = stmt.executeQuery();
           

            while (rs.next()) {

                Sapato sapato1 = new Sapato();
                
                sapato1.setCodSapato(rs.getInt("COD_SAPATO"));
                sapato1.setTipoSapato(rs.getString("NOME_TIPO_SAPATO"));
                sapato1.setCorSapato(rs.getString("NOME_COR_SAPATO"));
                sapato1.setNumSapato(rs.getInt("NUMERO"));
                sapato1.setMarca(rs.getString("MARCA"));
                sapato1.setConserto(rs.getString("CONSERTO"));
                sapato1.setValor(rs.getFloat("VALOR"));
                sapatos.add(sapato1);
            }
            return sapatos;
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           conexao.close();
        }
        return sapatos;
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
            stmt.setInt(4, p.getCodCorSapato());
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
    public void buscaSapato(Sapato p) {
         ServicoConexao con = (ServicoConexao) conexao.getConexao();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.getConexao().prepareStatement(
                    "Select * from sapato"
                    + "where cod_sapato =  ");
            stmt.setInt(1, p.getCodSapato());

            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                  p.setCodSapato(rs.getInt("COD_SAPATO"));
                  p.setCodTipoSapato(rs.getInt("COD_TIPO_SAPATO"));
                  p.setCodCorSapato(rs.getInt("COD_COR_SAPATO"));
                  p.setNumSapato(rs.getInt("NUMERO"));
                  p.setMarca(rs.getString("MARCA"));
                  p.
                  
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar sapato: " + ex);
        } finally {
            conexao.getConexao();
        }    
    }

}