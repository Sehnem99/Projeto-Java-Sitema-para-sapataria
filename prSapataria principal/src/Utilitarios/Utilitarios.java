
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
    
    public String dataFormatBanco(String dataString){
        String dia, mes, ano, datamySql;
        if("  /  /    ".equals(dataString)){
            
            datamySql = "";
        }else{
            dia = dataString.substring(0, 2);
            mes = dataString.substring(3, 5);
            ano = dataString.substring(6);
            datamySql = ano+"-"+mes+"-"+dia;
        } 
        return datamySql;
    }
    
    public String dataFormat(String dataString){
        String dia, mes, ano, datamySql;
        if(dataString.equalsIgnoreCase(null)){
            datamySql = "";
        }else{ 
            dia = dataString.substring(8, 2);
            mes = dataString.substring(5, 2);
            ano = dataString.substring(0, 4);
            datamySql = dia+"/"+mes+"/"+ano;
        } 
        return datamySql;
    }
    
    
    
     
     
     
     
}
