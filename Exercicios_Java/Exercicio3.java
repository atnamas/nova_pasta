package Exercicios_Java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas, minutos, segundos, sobraHoras, tempo;
		
		Scanner leia = new Scanner(System.in); 

		System.out.println("Insira o tempo do evento em segundos: ");
		tempo = leia.nextInt();
			
		horas = (tempo / 3600);
		
		sobraHoras = (tempo % 3600);
		
		minutos = (sobraHoras / 60);

		segundos = (sobraHoras % 60);
		
		System.out.println("O tempo de duração do evento em horas é de " + horas + "h " + minutos + "min " + segundos + "s");
	
		leia.close();
	}
	
	}


