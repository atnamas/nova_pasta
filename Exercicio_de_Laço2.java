package Br.com.Generation;

import java.util.Scanner;

public class Exercicio_de_La�o2 {

	public static void main(String[] args) {
	      
		Scanner leia = new Scanner(System.in);
		
		 int n1, n2, n3;
	        
	        System.out.println("Digite o primeiro n�mero: ");
	        n1 = leia.nextInt();
	        
	        System.out.println("Digite o segundo n�mero: ");
	        n2 = leia.nextInt();
	        
	        System.out.println("Digite o terceiro n�mero: ");
	        n3 = leia.nextInt();
	        
	        if(n1 < n2){
	            if (n2 < n3){
	                System.out.println("A ordem crescente : " + n1 + " " + n2 + " " + n3 + ".");
	            }
	                else if (n1 < n3) {
	                System.out.println("A ordem crescente : " + n1 + " " + n3 + " " + n2 + ".");
	                    
	            }
	                else {
	                System.out.println("A ordem crescente : " + n1 + " " + n3 + " " + n2 + ".");
	                }
	        }
	        
	        else if(n2 < n3){
	            if (n1 < n3){
	                System.out.println("A ordem crescente : " + n2 + " " + n1 + " " + n3 + ".");
	            }
	                else{
	                System.out.println("A ordem crescente : " + n2 + " " + n3 + " " + n1 + ".");
	                    
	            }
	        }
	        else {
	            System.out.println("A ordem crescente : " + n3 + " " + n2 + " " + n1 + ".");
	            }	     

	}

}
