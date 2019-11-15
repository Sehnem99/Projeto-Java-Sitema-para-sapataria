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

/**
 *
 * @author suporte
 */
public class ServicoCadCliente {
        private ServicoConexao conexao = new ServicoConexao();
        
        public void insert(Cliente cliente)throws SQLException{
            PreparedStatement pst = conexao.getConexao().prepareStatement
            ("insert into clientes(COD_CLIENTE, "
                    + "NOME_CLIENTE, "
                    + "CONTATO, "
                    + "CPF, "
                    + "DATA_NASC, CEP, "
                    + "LOGRADOURO, "
                    + "BAIRRO, "
                    + "CIDADE, "
                    + "UF, "
                    + "ATIVO)" +
            "values (0,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getContato());
            pst.setString(3, cliente.getCpf());
            pst.setString(4, cliente.getData_nasc());
            pst.setInt(5, cliente.getCep());
            pst.setString(6, cliente.getLogradouro());
            pst.setString(7, cliente.getBairro());
            pst.setString(8, cliente.getCidade());
            pst.setString(9, cliente.getUf());
            pst.setInt(10, cliente.getAtivo());
            
            //usar sempre pra inserir ou modificar dado na tabela
            pst.executeUpdate();
            pst.close();
            conexao.close();
        }
        
        public void update(Cliente cliente)throws SQLException{
        PreparedStatement pst = conexao.getConexao().prepareStatement(
        "update clientes "
         + "set COD_CLIENTE = ?,"
            + " NOME_CLIENTE = ?,"
            + " CONTATO = ?,"
            + " CPF = ?,"
            + " CEP = ?"
            + " ATIVO = ?,"
            + " BAIRRO = ?,"
            + " CIDADE = ?,"
            + " UF = ?,"
            + " ATIVO = ?,"         
            + " where (codigo = ?)");
    
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getContato());
        pst.setString(3, cliente.getCpf());
        pst.setString(4, cliente.getData_nasc());
        pst.setInt(5, cliente.getCep());
        pst.setString(6, cliente.getLogradouro());
        pst.setString(7, cliente.getBairro());
        pst.setString(8, cliente.getCidade());
        pst.setString(9, cliente.getUf());
        pst.setInt(10, cliente.getAtivo());
        pst.setInt(11, cliente.getCodigo());
        pst.executeUpdate();
        pst.close();
        conexao.close();
        }
        public void setCodigoCliente(Cliente cliente)throws SQLException{
        PreparedStatement pst =
        conexao.getConexao().prepareStatement(
           "select codigo from cliente where (CPF = ?)"
        );
        pst.setString(1, cliente.getCpf());
     
        ResultSet rs = pst.executeQuery();
        rs.first();
        cliente.setCodigo(rs.getInt("codigo"));
        
        rs.close();
        pst.close();
        conexao.close();
        }
        
    
}
