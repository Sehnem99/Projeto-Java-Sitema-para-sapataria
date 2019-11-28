/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import Classes.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author suporte
 */
public class ServicoCadCliente {
        private ServicoConexao conexao = new ServicoConexao();
        
        public boolean insert(Cliente cliente)throws SQLException{

            String sql = "insert into clientes(COD_CLIENTE, NOME_CLIENTE, CONTATO, CPF, DATA_NASC, CEP, LOGRADOURO, BAIRRO, CIDADE, UF, ATIVO,NUM)" +
            "values (0,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps;
                ps = conexao.getConexao().prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getContato());
                ps.setString(3, cliente.getCpf());
                ps.setString(4, cliente.getData_nasc());
                ps.setInt(5, cliente.getCep());
                ps.setString(6, cliente.getLogradouro());
                ps.setString(7, cliente.getBairro());
                ps.setString(8, cliente.getCidade());
                ps.setString(9, cliente.getUf());
                ps.setInt(10, cliente.getAtivo());
                ps.setString(11, cliente.getNum());
                //usar sempre pra inserir ou modificar dado na tabela
                ps.execute();
                ps.close();
                conexao.close();
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        
        public boolean consultaCliente(Cliente cliente) throws SQLException{
            String sql;
            
            sql = "SELECT * FROM CLIENTES WHERE CPF = ?";
            PreparedStatement ps;
            
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getCpf());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cliente.setNome(rs.getString("NOME_CLIENTE"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setCodigo(rs.getInt("COD_CLIENTE"));
                cliente.setAtivo(rs.getInt("ATIVO"));
                cliente.setBairro(rs.getString("BAIRRO"));
                cliente.setCep(rs.getInt("CEP"));
                cliente.setCidade(rs.getString("CIDADE"));
                cliente.setData_nasc(rs.getString("DATA_NASC"));
                cliente.setLogradouro(rs.getString("LOGRADOURO"));
                cliente.setNum(rs.getString("NUM"));
                cliente.setUf(rs.getString("UF"));
                cliente.setContato(rs.getString("CONTATO"));
                cliente.setCodigo(rs.getInt("COD_CLIENTE"));
                return true;
            }
                return false;
        }
        
        public boolean update(Cliente cliente)throws SQLException{
            
        String sql = "UPDATE CLIENTES " +
        "SET NOME_CLIENTE = ? " +
        "WHERE CPF = ?";
        
        try {
            PreparedStatement ps;
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2,cliente.getCpf());
            ps.execute();
            ps.close();
            return true; 
            } catch (SQLException ex) {
                return false;
            }
        }

        
    
}
