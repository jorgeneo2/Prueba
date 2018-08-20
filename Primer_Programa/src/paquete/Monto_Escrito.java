package paquete;

import java.util.Scanner;

public class Monto_Escrito {
	
	String letra;
	String resultado;
	String resultado1;
	String resultado2;
	String resultado3;
	String resultado4;
	

	String unidades[] = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };

	String especial[] = { "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho",
			"diecinueve" };

	String decenas[] = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
			"noventa" };

	 String centenas[] =
	        {"cien","doscientos","trescientos","cuatroscientos","quinientos",
	        	"seiscientos","setescientos","ochoscientos","novescientos"};
	 
    String unidMil[]=
    {"mil", "dos mil","tres mil", "cuatro mil","cinco mil","seis mil",
    	"siete mil","ocho mil", "nueve mil", "diez mil"};
	        
    public String calcularUnidad(int num) {
		if(num<10) {
			resultado=unidades[num];
		}
		return resultado;
	}

	public String calcularEspecial(int num) {
		if(num > 10 && num<20) {
			resultado1=especial[num - 11];
		}
			return resultado1;
	}
	public String calcularDecenas(int num) {
		if(num<100){
            int unid = num % 10;
            int dec = num/10;
            if(unid == 0)
            	resultado2=(decenas[dec-1]);                
            else
            	resultado2=(decenas[dec-1]
                                       + " y " + unidades[unid]);
		}
			return resultado2;

		}

	
	public String calcularCentenas(int num) {
		if(num<1000){
            int unid = num % 10;
            int dec = (num/10)%10;
            int cent=num/10/10;
            if(unid == 0 && dec==0)
            	resultado3=(centenas[cent-1]);  
            if(dec==0)
            	resultado3=(centenas[cent-1] +" "+ unidades[unid]);   
            else if(dec == 1 && unid !=0)
            	resultado3=(centenas[cent-1] +" "+ especial[unid-1]);   
            else if(dec == 1 && unid ==0)
            	resultado3=(centenas[cent-1] +" "+ decenas[(dec-1)]);
            else
            	resultado3=(centenas[cent-1] +" "+ decenas[(dec-1)]
                                       + " y " + unidades[unid]);
        }
			return resultado3;

		}


	public String calcularunidMil(int num) {
		if(num<10000){
        	int unid = num % 10;
            int dec = (num/10)%10;
            int cent=num/10/10%10;
            int unidmil=num/10/10/10%10;
            String textoNum= unidMil[unidmil-1];
            if(cent>0) {
                textoNum=textoNum+" "+ centenas[cent-1];
            }
            if(dec == 1 && unid > 0)
                    textoNum=textoNum+" "+ especial[unid-1];
            else if(dec > 1){
                textoNum=textoNum+" "+ decenas[(dec-1)];
                 if(unid>0)
                     textoNum=textoNum+" y " + unidades[unid];
            }else if(unid>0){
                     textoNum=textoNum+" " + unidades[unid];
            }
		
            resultado4=(textoNum); 
 
		}
			return resultado4;

		}

	}