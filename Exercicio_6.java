package Br.com.Generation.Repeti��o;

import java.util.Scanner;

public class Exercicio_6 {
	
public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int num = 0, soma = 0, i = 0, media;
		
		do {
			System.out.println("Digite o n�mero que deseja somar, e para finalizar digite 0: ");
			num = l.nextInt();
			
			if(num % 3 == 0 && num != 0) {
			soma += num;
			i++;
			}			
		}
		while(num !=0);
		
		media = soma/i;
		
		System.out.println("\nA m�dia dos m�ltiplos de 3 �: " + media);
		l.close();

}

}
