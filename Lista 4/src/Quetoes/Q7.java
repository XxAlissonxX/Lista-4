package Quetoes;

import java.util.Scanner;

public class Q7 {
	
	public String entrada;
	public String saida = "";
	
	public void ler() {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite uma palavra: ");
		entrada = ler.next();
	}
	
	public void inverter() {
		
		ler();
		for(int i = entrada.length()-1;i>=0;i--) {
			
			saida = saida + entrada.charAt(i);
		}
		System.out.println();
		System.out.println(saida);
	}
}
