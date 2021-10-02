package Exercicios_Java;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;

		System.out.println("Digite o Valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o Valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o Valor de C: ");
		c = leia.nextInt();
		
		r = (a+b) * (a+b);
		System.out.println("O valor de R é: " + r);

		s = (b+c) * (b+c);
		System.out.println("\nO valor de S é: " + s);

		d = (r + s) / 2;
		System.out.println("\nValor de D é: " + d);

		leia.close();
	
	}

}
