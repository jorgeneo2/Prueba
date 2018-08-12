
import java.util.Scanner;

public class Monto_Escrito {
	
    
    public static void main(String[] args) {
        
        String unidades[] = 
        {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco" ,
            "seis" ,"siete" ,"ocho" ,"nueve","diez"};
        String especiales[] = 
        {"once", "doce","trece","catorce", "quince", 
            "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
        String decenas[] = 
        {"veinte", "treinta","cuarenta","cincuenta", "sesenta",
            "setenta", "ochenta", "noventa"};
        String centenas[] =
        {"cien","doscientos","trescientos","cuatroscientos","quinientos",
        	"seiscientos","setescientos","ochoscientos","novescientos"};	
    
        Scanner sc = new Scanner(System.in);//crear un objeto Scanner
        System.out.print("Ingrese un numero entre 0-99: ");
        int num;
        num =sc.nextInt();
        
        if(num>=0 && num<11)
             System.out.print('\n' + unidades[num]);         
        else if(num<20)
            System.out.print('\n' + especiales[num-11]);        
        else if(num<100){
            int unid = num % 10;
            int dec = num/10;
            if(unid == 0)
                System.out.print('\n' + decenas[dec-2]);                
            else
                System.out.print('\n' + decenas[dec-2]
                                       + " y " + unidades[unid]);
        }
        else if(num<1000){
            int unid = num % 10;
            int dec = num/10;
            int cent=num/10/10;
            if(unid == 0)
                System.out.print('\n' + centenas[cent-1]);  
            else
                System.out.print('\n' + decenas[dec-2]
                                       + " y " + unidades[unid]);
             
        }else            
            System.out.print("El numero debe ser menor a 100");
       
    } 
    
    
}