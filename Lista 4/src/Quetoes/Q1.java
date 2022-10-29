package Quetoes;

import java.util.Scanner;

public class Q1 {
	
	public int minimo;
	public int salario;
	public int depende;
	public int taxa;
	public int imposto;
	public int impostototal;
	public int restitui;
	
	public void leitura() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor do salario minimo:");
		minimo = ler.nextInt();
		
		System.out.println("Qual o salario do funcionario:");
		salario = ler.nextInt();
		
		System.out.println("Qual o numero de dependentes:");
		depende = ler.nextInt();
		
		System.out.println("Qual a porcentagem ja paga da taxa:");
		taxa = ler.nextInt();
		
	}
	
	public void imposto() {
		
		if(salario>(12*minimo)) {
			
			imposto =(int) (salario * 0.2f);
		}else if(salario>(5*minimo)&&salario<=(12*minimo)) {
			
			imposto =(int) (salario * 0.08f);
		}else {
			imposto=imposto;
		}
	}
	public void calcular() {
		leitura();
		imposto();
		
		restitui = depende * 2;
		restitui = restitui / 100;
		restitui = imposto * restitui;
		impostototal = (int) (imposto * 1.04f);
		taxa = impostototal * (taxa/100);
		imposto = impostototal - taxa;
		imposto = imposto - restitui;
	}
	
	public void rodar() {
		
		calcular();
		
		System.out.println("Imposto de Renda : "+impostototal);
		System.out.println("Valor em Debito: "+ imposto);
	}
}
