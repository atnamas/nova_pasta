package Br.com.Generation;

import java.util.Scanner;

public class Exercicio_de_Laço1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2, numero3, Maiornum;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextInt(); 
		System.out.println("Digite o terceiro numero: ");
		numero3 = ler.nextInt();
		
		  if(numero1 > numero2) {
	            if(numero1 > numero3)
	                Maiornum = numero1;
	            else
	                Maiornum = numero3;
	        }
	        else {
	            if(numero2 > numero3)
	                Maiornum = numero2;
	            else
	                Maiornum = numero3;
	        }

	        System.out.println("O maior número é " + Maiornum);


	}

}
