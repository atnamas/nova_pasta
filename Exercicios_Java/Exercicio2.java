package Exercicios_Java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int dias, mes, idade, dia; 
	     
	     Scanner leia = new Scanner(System.in); 
	     
	     System.out.println("Quantos dias de vida você tem: "); 
	     dia = leia.nextInt();
	     
	     idade = dia/365; 
	     
	     mes = idade * 12; 
	     
	     dias = (dia % 365)/30; 
	     
	     System.out.println("sua idade é: " + idade);
	     System.out.println("mes: " + mes);
	     System.out.println("dias: " + dias);
	     
	     leia.close();
	    		 
	     
	     
	     
	
	
	
	
	
	}  

}
