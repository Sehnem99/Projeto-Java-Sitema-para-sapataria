
package Utilitarios;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utilitarios {
    
    
    SimpleDateFormat vDateFormat = new SimpleDateFormat("yyyy-MM-dd");
     
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
    
    public Date dataFormatBanco(Date data){
        Date dataFormat;
        String dia, mes, ano, datamySql, dataString;
        dataString = DateTimeDV.
        dia = dataString.substring(0, 2);
        mes = dataString.substring(3, 5);
        ano = dataString.substring(6);
        
        datamySql = ano+"-"+mes+"-"+dia;
        dataFormat = java.sql.Date.valueOf(dataString);
        
        return dataFormat;
    }
    
    
    
     
     
     
     
}
