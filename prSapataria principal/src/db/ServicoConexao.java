package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
// criar variável conexao
public class ServicoConexao {
public Connection connection;
//driver, DRIVER = banco de dados, URL referente ao caminho
public Connection getConexao(){
    final String DRIVER = "com.mysql.jdbc.Driver";
    final String URL = "jdbc:mysql://localhost:3306/SHOEMAKER";
 // tenta a conexao, root e root como usuário e senha   
    try{
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(
                URL, 
                "root",
                ""
        );
        return connection;
    }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null, "Driver não encontrado: " + e.toString());
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Problemas na fonte de dados." + e.toString());
    }
    return null;
}
//fechar conexão
public void close(){
    try{
        connection.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Problemas ao fechar conexão" + e.toString());
    }
        
}

    PreparedStatement getConexao(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
