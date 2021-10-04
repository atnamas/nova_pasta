package Br.com.Generation;

import java.util.Scanner;

public class Exercicio_de_Laço3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Você pertence a categoria Infantil.");
		}
		
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Você pertence a categoria Juvenil.");
		}
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Você pertence a categoria Adulto.");
		}
		
		else {
			System.out.println("Desculpe, mas você não pertence a nenhuma categoria.");
		}
		
	}

}
