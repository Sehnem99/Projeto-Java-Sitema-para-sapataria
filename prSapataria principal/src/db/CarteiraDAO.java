
package db;

import Classes.Carteira;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import Utilitarios.Utilitarios;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class CarteiraDAO {
    private ServicoConexao conexao = new ServicoConexao();
    DecimalFormat decimal = new DecimalFormat("R$ ###,###,###,##0.00");
    Utilitarios utilit = new Utilitarios();
    SimpleDateFormat vDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
     public boolean insertDespesa(Carteira p) {
        
        String sql = "insert into despesa values (0,?,?,?);";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setString(1, p.getDescDespesa());
                ps.setFloat(2, p.getValorDespesa());
                ps.setDate(3, Date.valueOf(utilit.dataFormatBanco(p.getDataAtual())));
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (SQLException e) {
                return false;
            }

    }   
    
    public void buscaValorInicial(Carteira p) {
        
        PreparedStatement stmt = null;

        try {
            String sql = "select sum(a.valor)a from sapato as a";
            stmt = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                  p.setValorInicial(decimal.format(rs.getFloat("a")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar sapato: " + ex);
        } finally {
            conexao.getConexao();
        }    
    }
    
    public void buscaValorDespesa(Carteira p) {
        
        PreparedStatement stmt = null;

        try {
            String sql = "select sum(a.valor)a from despesa as a";
            stmt = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                  p.setValorTotalDespesa(decimal.format(rs.getFloat("a")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar sapato: " + ex);
        } finally {
            conexao.getConexao();
        }    
    }
    
   public void buscaSaldoPrevisto(Carteira p){
       PreparedStatement stmt = null;

        try {
            String sql = "SELECT (\n" +
"(SELECT SUM(VALOR) FROM SAPATO) - (SELECT SUM(VALOR) FROM DESPESA)) AS TESTE";
            stmt = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                  p.setValorSaldo(decimal.format(rs.getFloat("TESTE")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar sapato: " + ex);
        } finally {
            conexao.getConexao();
        }   
   }
    
}
