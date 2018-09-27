/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author WELLINGTON
 */
public class convertirfecha {
    
    public static String cfechalan(String mes){
        String m="";
        
        switch (mes){
            case "enero": 
                m="01";
                break;
                
            case "febrero": 
                m="02";
                break;
                
            case "marzo": 
                m="03";
                break;
            
            case "abril": 
                m="04";
                break;
                
            case "mayo": 
                m="05";
                break;
                
            case "junio": 
                m="06";
                break;
                
            case "julio": 
                m="07";
                break;
            
            case "agosto": 
                m="08";
                break;
            
            case "septiembre": 
                m="09";
                break;
                
            case "octubre": 
                m="10";
                break;
                
            case "noviembre": 
                m="11";
                break;
            
            case "diciembre": 
                m="12";
                break;
            
            default:
                break;
        }
        
        
        return m;
    }
    
    public static String fechaconv (String d, String m, String a){
        String d1="", m1="", a1="", fechaconv="";
          
        d1=d;
        m1=cfechalan(m);
        a1=a;
        
        fechaconv=a1+"-"+m1+"-"+d1;
        
        return fechaconv;
    }

}
