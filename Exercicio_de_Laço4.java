package Br.com.Generation;

import javax.swing.JOptionPane;

public class Exercicio_de_Laço4 {

	public static void main(String[] args) {
	      
double n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o seu numero: "));
		
		if (n % 2 == 0 ) {
			JOptionPane.showMessageDialog(null, "O numero digitado é Par e a sua raiz é: "
			+ Math.sqrt(n), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "O numero é impar e elevado ao quadrado "
			+ "o resultado é "+ Math.pow(n, 2.0), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
         
		

	}

}
