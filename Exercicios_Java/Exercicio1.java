package Exercicios_Java;

import java.util.*; 

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int dias, meses, anos, resultado; 
	      
	      Scanner leia = new Scanner(System.in); 
	      
	      System.out.println("Digite o dia que você nasceu: "); 
	      dias = leia.nextInt(); 
	      
	      System.out.println("Digite o mês que você nasceu: "); 
	      meses = leia.nextInt(); 
	    
          System.out.println("Digite o ano que você nasceu: ");
          anos = leia.nextInt(); 
      
          resultado = dias + (meses * 30 ) + (( 2021 - anos)* 365); 
          System.out.println("Seus dias de vida são: " + resultado); 
          
          leia.close(); 
	
	}
} 
