
package Utilitarios;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;


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
    
    public String formatValorReais(String valor){
    
        DecimalFormat decimal = new DecimalFormat("###,###,###,##0.00");
        decimal.format(valor);
        
        return valor;        
    }
    
    
    
     
     
     
     
}
