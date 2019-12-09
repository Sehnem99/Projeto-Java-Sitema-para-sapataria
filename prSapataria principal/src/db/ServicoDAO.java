package db;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Classes.CorSapato;
import Classes.Sapato;
import Classes.TipoSapato;
import Classes.Venda;
import Utilitarios.Utilitarios;
import java.sql.Date;
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
        
        String sql = "insert into sapato values (0,?,?,?,?,?,?,?,?,?);";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setInt(1, p.getCodCliente());
                ps.setInt(2, p.getCodTipoSapato());
                ps.setInt(3, p.getCodCorSapato());
                ps.setInt(4, p.getNumSapato());
                ps.setString(5, p.getMarca());
                ps.setString(6, p.getConserto());
                ps.setDate(7, p.getDataEntrada());
                ps.setDate(8, p.getDataSaida());
                ps.setFloat(9, p.getValor());
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (SQLException e) {
                return false;
            }

    }
    public void insertVenda(Venda v) {
        
        String sql = "insert into vendas values (0,?,?,?,?,?,?);";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setInt(1, v.getCodSapato());
                ps.setDate(2, (Date) v.getData_entrada());
                ps.setDate(3, (Date) v.getData_saida());
                ps.setFloat(4, v.getValorPrevisto());
                ps.setFloat(5, v.getValorFinal());
                ps.setDate(6, (Date) v.getData_saida());
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

    }
    
    
    //carrega tipos do sapato em list 
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
    //carrega cores do sapato em list 
    public List<CorSapato> readCorSapato() {

        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<CorSapato> corSapatos = new ArrayList<>();
        String sql = "select * from cor_sapato";
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
        String sql = "select a.COD_SAPATO, b.NOME_TIPO_SAPATO, c.NOME_COR_SAPATO, a.NUMERO, a.MARCA, a.CONSERTO, a.VALOR "
                     + "from sapato a, tipos_sapato b, cor_sapato c "
                       + "where a.COD_TIPO_SAPATO = b.COD_TIPO_SAPATO "
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
    
    
    public boolean updateSapato(Sapato p) {

        PreparedStatement stmt = null;

        try {
            String sql ="UPDATE sapato SET "
                        + "COD_CLIENTE = ? ,"
                        + "COD_TIPO_SAPATO = ? ,"
                        + "COD_COR_SAPATO = ? ,"     
                        + "NUMERO = ? ,"
                        + "MARCA = ? ,"
                        + "CONSERTO = ? ,"
                        + "VALOR = ? "            
                   + "WHERE COD_SAPATO = ?"; 
            stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, p.getCodCliente()); 
            stmt.setInt(2, p.getCodTipoSapato());    
            stmt.setInt(3, p.getCodCorSapato());
            stmt.setInt(4, p.getNumSapato());
            stmt.setString(5, p.getMarca());
            stmt.setString(6, p.getConserto());
            stmt.setFloat(7, p.getValor());
            stmt.setInt(8, p.getCodSapato());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            conexao.close();
        }
    }
    
    public boolean deleteSapato(Sapato p) {

        PreparedStatement stmt = null;

        try {
            String sql = "DELETE from sapato WHERE COD_SAPATO = ?";
            stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, p.getCodSapato());

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            conexao.getConexao();
        }  

    }
    public void buscaSapato(Sapato p) {
        
        PreparedStatement stmt = null;

        try {
            String sql = "Select * from sapato where cod_sapato = ?";
            stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, p.getCodSapato());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                  p.setCodSapato(rs.getInt("COD_SAPATO"));
                  p.setCodTipoSapato(rs.getInt("COD_TIPO_SAPATO"));
                  p.setCodCorSapato(rs.getInt("COD_COR_SAPATO"));
                  p.setNumSapato(rs.getInt("NUMERO"));
                  p.setMarca(rs.getString("MARCA"));
                  p.setConserto(rs.getString("CONSERTO"));
                  p.setValor(rs.getFloat("VALOR"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar sapato: " + ex);
        } finally {
            conexao.getConexao();
        }    
    }

}