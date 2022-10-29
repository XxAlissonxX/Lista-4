package Quetoes;

import java.util.Scanner;

public class Q8 {
	public char vet[];
	public String numero;
	
	public void ler() {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		numero = ler.next();
		
	}
	
	public void passarVetor() {
		
		ler();
		vet = numero.toCharArray();
	}
	public void conferirNum() {
		passarVetor();
		
		for(int i=0;i<vet.length;i++) {
			
			if(vet[i]=='#'){
				vet[i]='1';
			}else if(vet[i]=='a'||vet[i]=='b'||vet[i]=='c') {
				vet[i]='2';
			}else if(vet[i]=='d'||vet[i]=='e'||vet[i]=='f') {
				vet[i]='3';
			}else if(vet[i]=='g'||vet[i]=='h'||vet[i]=='i') {
				vet[i]='4';
			}else if(vet[i]=='j'||vet[i]=='k'||vet[i]=='l') {
				vet[i]='5';
			}else if(vet[i]=='m'||vet[i]=='n'||vet[i]=='o') {
				vet[i]='6';
			}else if(vet[i]=='p'||vet[i]=='q'||vet[i]=='r'||vet[i]=='s') {
				vet[i]='7';
			}else if(vet[i]=='t'||vet[i]=='u'||vet[i]=='v') {
				vet[i]='8';
			}else if(vet[i]=='w'||vet[i]=='x'||vet[i]=='y'||vet[i]=='z') {
				vet[i]='9';
			}else if(vet[i]=='+') {
				vet[i]='0';
			}
		}
			
	}
	
	public void rodar() {
		
		conferirNum();
		System.out.print("\n(");
		for(int i=0;i<3;i++) {
		System.out.print( vet[i]);
		}
		System.out.print(")");
		for(int i=3;i<vet.length;i++) {
			System.out.print(vet[i]);
			}
	}
}
