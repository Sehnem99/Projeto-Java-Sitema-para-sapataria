
package db;

import Classes.Carteira;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class CarteiraDAO {
    private ServicoConexao conexao = new ServicoConexao();
    DecimalFormat decimal = new DecimalFormat("R$ ###,###,###,##0.00");
    
     public boolean insertDespesa(Carteira p) {
        
        String sql = "insert into despesa values (0,?,?,?);";
        
        try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setString(1, p.getDescDespesa());
                ps.setFloat(2, p.getValorDespesa());
                Date d = new Date();
                ps.setDate(3, d.getTime());
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (SQLException e) {
                return false;
            }

    }   
    
    public String buscaSaldoInicial(Carteira c){
        String valorInicial=null;
        
        String sql = "select max( cod_sapato ) as a from sapato;";
        
        try {
                PreparedStatement stmt = null;

                stmt = conexao.getConexao().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                 if(rs.next()){
                    c.set(decimal.format(rs.getFloat("a")));  
                 }
               
                stmt.close();
                conexao.close();
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, e);
        }
        
        
        return 
    }
}
