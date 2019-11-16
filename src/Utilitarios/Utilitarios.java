
package Utilitarios;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class Utilitarios {
    
    
    SimpleDateFormat vDateFormat = new SimpleDateFormat("dd/MM/yyyy");
     
    public static int strToInt(String valor, int padrao){
        try {
             return Integer.valueOf(valor); // Para retornar um Integer, use Integer.parseInt
         } 
        catch (NumberFormatException e) {  // Se houver erro na conversão, retorna o valor padrão
             return padrao;
         }
    }
     
     
     
     
}