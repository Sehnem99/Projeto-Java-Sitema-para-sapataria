package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Classes.Login;
import javax.swing.JOptionPane;

//import prSapataria.------; incluir classes

public class ServicoLogin {
    private ServicoConexao conexao = new ServicoConexao();
    private Login login = new Login();

    public void setUsuario (Login login) throws SQLException{
        PreparedStatement pst = 
        conexao.getConexao().prepareStatement(
        "SELECT * FROM USUARIO WHERE (LOGIN = ?) AND (SENHA = ?);");
        pst.setString(1, login.getLogin());
        pst.setString(2, login.getSenha());
        ResultSet rs = pst.executeQuery();
        rs.first();
        rs.next();
        rs.close();
        pst.close();
        conexao.close();
    }
    
    public boolean consultaUser(String logon,String senha) throws SQLException{
        
         
        boolean validar = false;
       
        String sql, l, s;
        sql = "SELECT * FROM USUARIOS WHERE (LOGIN = ?) AND (SENHA = ?)";
        PreparedStatement ps;
        
        ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, logon);
        ps.setString(2, senha);
        
        ResultSet rs = ps.executeQuery();
        if (rs.first()){
              validar = true;
            
            /*
               (rs.getString("senha").compareTo(senha)))     
                validar = true
                      (rs.getString("senha").compareTo(senha)));
            JOptionPane.showMessageDialog(null, rs.getString("login") + "\n" +
                    rs.getString("senha"));
        }
        */
        ps.close();
        
        return validar;
    }
        return validar;
    }
}
