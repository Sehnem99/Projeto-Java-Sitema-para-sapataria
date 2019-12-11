package db;


import Classes.CorSapato;
import Classes.Sapato;
import Classes.TipoSapato;
import Classes.Venda;
import Utilitarios.Utilitarios;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
    SimpleDateFormat vDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    DecimalFormat decimal = new DecimalFormat("R$ ###,###,###,##0.00");
    
    public void buscaUltimoCodSapato(Venda v){
        String sql = "select max( cod_sapato ) as a from sapato;";
        
        try {
                PreparedStatement stmt = null;

                stmt = conexao.getConexao().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                 if(rs.next()){
                    v.setCodSapato(rs.getInt("a"));  
                 }
               
                stmt.close();
                conexao.close();
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
        public boolean insertVendaComData(Venda v) {
        
        String sql = "insert into vendas values (0,?,?,?)";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setInt(1, v.getCodSapato());
                ps.setFloat(2, v.getValorFinal());
                ps.setDate(3,Date.valueOf(utilit.dataFormatBanco(v.getData_pagamento())));
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (SQLException e) {
                return false;
            }
    }
    
    public boolean insertVendaSemData(Venda v) {
        
        String sql = "insert into vendas (COD_VENDA, COD_SAPATO, VALOR_FINAL) values (0,?,?)";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setInt(1, v.getCodSapato());
                ps.setFloat(2, v.getValorFinal());
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (SQLException e) {
                return false;
            }
    }
    
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
                ps.setDate(7, Date.valueOf(utilit.dataFormatBanco(p.getDataEntrada())));
                ps.setDate(8, Date.valueOf(utilit.dataFormatBanco(p.getDataEntrada())));
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
    public boolean insertSapatoSemDataFim(Sapato p) {
        
        String sql = "insert into sapato "
        +"(COD_SAPATO,COD_CLIENTE,COD_TIPO_SAPATO,COD_COR_SAPATO,NUMERO,MARCA,CONSERTO,DATA_ENTRADA,VALOR)\n" +
                     "values  (0,?,?,?,?,?,?,?,?);";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setInt(1, p.getCodCliente());
                ps.setInt(2, p.getCodTipoSapato());
                ps.setInt(3, p.getCodCorSapato());
                ps.setInt(4, p.getNumSapato());
                ps.setString(5, p.getMarca());
                ps.setString(6, p.getConserto());
                ps.setDate(7, Date.valueOf(utilit.dataFormatBanco(p.getDataEntrada())));
                ps.setFloat(8, p.getValor());
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (SQLException e) {
                return false;
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
        String sql = "select a.COD_SAPATO, b.NOME_TIPO_SAPATO, c.NOME_COR_SAPATO, a.NUMERO, a.MARCA,"
                          +" a.DATA_ENTRADA, a.CONSERTO, a.VALOR "
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
                sapato1.setDataEntrada(String.valueOf(vDateFormat.format(rs.getDate("DATA_ENTRADA"))));
                sapato1.setValorFormat(decimal.format(rs.getFloat("VALOR")));
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
    
     public List<Sapato> readSevPendentes() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

         
        List<Sapato> sapatos = new ArrayList<>();
        String sql = 
          "select d.COD_CLIENTE, d.NOME_CLIENTE,a.COD_SAPATO, b.NOME_TIPO_SAPATO, c.NOME_COR_SAPATO, a.NUMERO, "
               +"a.MARCA, a.DATA_ENTRADA,a.DATA_SAIDA, a.CONSERTO, a.VALOR "
          + "from sapato a, tipos_sapato b, cor_sapato c, clientes d  "
                       + "where a.COD_TIPO_SAPATO = b.COD_TIPO_SAPATO "
                         + "and a.COD_CLIENTE = d.COD_CLIENTE "
		         + "and d.COD_CLIENTE in (Select cod_cliente from clientes where ATIVO = 1) "
                         + "and a.DATA_SAIDA is null "
         + "group by COD_CLIENTE,COD_SAPATO";
        try {
            stmt = conexao.getConexao().prepareStatement(sql);
            rs = stmt.executeQuery();
           

            while (rs.next()) {

                Sapato sapato1 = new Sapato();
                
                sapato1.setCodCliente(rs.getInt("COD_CLIENTE"));
                sapato1.setNomeCliente(rs.getString("NOME_CLIENTE"));
                sapato1.setTipoSapato(rs.getString("NOME_TIPO_SAPATO"));
                sapato1.setCorSapato(rs.getString("NOME_COR_SAPATO"));
                sapato1.setNumSapato(rs.getInt("NUMERO"));
                sapato1.setMarca(rs.getString("MARCA"));
                sapato1.setConserto(rs.getString("CONSERTO"));
                sapato1.setDataEntrada(String.valueOf(vDateFormat.format(rs.getDate("DATA_ENTRADA"))));
                if(rs.getDate("DATA_SAIDA") == null){
                  String aux = " ";
                  sapato1.setDataSaida(aux);
                }else{
                  sapato1.setDataSaida(String.valueOf(vDateFormat.format(rs.getDate("DATA_SAIDA"))));  
                }
                sapato1.setValorFormat(decimal.format(rs.getFloat("VALOR")));
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
                        + "DATA_ENTRADA = ?,"
                        + "DATA_SAIDA = ?,"
                        + "VALOR = ? "            
                   + "WHERE COD_SAPATO = ?"; 
            stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, p.getCodCliente()); 
            stmt.setInt(2, p.getCodTipoSapato());    
            stmt.setInt(3, p.getCodCorSapato());
            stmt.setInt(4, p.getNumSapato());
            stmt.setString(5, p.getMarca());
            stmt.setString(6, p.getConserto());
            stmt.setDate(7, Date.valueOf(utilit.dataFormatBanco(p.getDataEntrada())));
            stmt.setDate(8, Date.valueOf(utilit.dataFormatBanco(p.getDataSaida())));
            stmt.setFloat(9, p.getValor());
            stmt.setInt(10, p.getCodSapato());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            conexao.close();
        }
    }
    
    public boolean updateSapatoSemDataFim(Sapato p) {

        PreparedStatement stmt = null;
        
        try {
            String sql ="UPDATE sapato SET "
                        + "COD_CLIENTE = ? ,"
                        + "COD_TIPO_SAPATO = ? ,"
                        + "COD_COR_SAPATO = ? ,"     
                        + "NUMERO = ? ,"
                        + "MARCA = ? ,"
                        + "CONSERTO = ? ,"
                        + "DATA_ENTRADA = ?"
                        + "VALOR = ? "            
                   + "WHERE COD_SAPATO = ?"; 
            stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, p.getCodCliente()); 
            stmt.setInt(2, p.getCodTipoSapato());    
            stmt.setInt(3, p.getCodCorSapato());
            stmt.setInt(4, p.getNumSapato());
            stmt.setString(5, p.getMarca());
            stmt.setString(6, p.getConserto());
            stmt.setDate(7, Date.valueOf(utilit.dataFormatBanco(p.getDataEntrada())));
            stmt.setFloat(8, p.getValor());
            stmt.setInt(9, p.getCodSapato());
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
                  p.setDataEntrada(String.valueOf(vDateFormat.format(rs.getDate("DATA_ENTRADA"))));
                  if(rs.getDate("DATA_SAIDA") == null){
                    String aux = " ";
                    p.setDataSaida(aux);
                  }else{
                    p.setDataSaida(String.valueOf(vDateFormat.format(rs.getDate("DATA_SAIDA"))));  
                  }
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