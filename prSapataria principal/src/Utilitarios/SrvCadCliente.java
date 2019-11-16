/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import Classes.Cliente;
import db.ServicoCadCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author suporte
 */
public class SrvCadCliente {
    ArrayList<Cliente> lista = new ArrayList<>();
    
    public void persitirBanco(Cliente cliente){
        ServicoCadCliente srvCliente = 
                new ServicoCadCliente();
        //ServicoBancoParecer srvParecer = 
        //        new ServicoBancoParecer();
       
        try{
           srvCliente.insert(cliente);
           srvCliente.setCodigoCliente(cliente);
           
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        /*ArrayList<Parecer> listaparecer =
        obra.getLista();
        
        for (Parecer p:listaparecer){
          try{
            srvParecer.insert(p, obra.getCodigo());
           } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
          }          
        }*/
    }
    
    public void setLista(Cliente cliente){
        this.lista.add(cliente);
    }
    
}
