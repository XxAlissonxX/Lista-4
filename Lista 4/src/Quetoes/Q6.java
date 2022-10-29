package Quetoes;

import java.util.Scanner;

public class Q6 {
	
	public int hrs;
	public int min;
	public int massa;
	public int seg;
	
	public void ler(){
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a massa inicial em gramas:");
		massa=ler.nextInt();
	}
	
	
	
	public void calcular() {
		ler();
		int cont =0;
		
			do {
				massa = massa/2;
				cont++;
			}while(massa>0.5);
		
		
			seg = cont * 50;
			System.out.println("\n Tempo total em segundos: "+seg);
		}
		
		
	
	public void tempo() {
		
		calcular();
		
		hrs = seg/3600;
		seg%=3600;
		min = seg/60;
		seg%=60;
		
		System.out.println("*****Tempo*****");
		System.out.println();
		if(hrs>0)
			System.out.println("horas: " + hrs);
		if(min>0)
			System.out.println("minutos: "+ min);
		if(seg>0)
			System.out.println("segundos: "+ seg);
	
	}
	
	public void rodar() {
		
		tempo();
	}
}
