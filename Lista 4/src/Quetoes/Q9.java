package Quetoes;

import java.util.Scanner;

public class Q9 {
	
	public int h;
	public int cont;
	
	public void ler() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a altura do triangulo: ");
		h = ler.nextInt();
	}
	
	public void desenhar (){   
		ler();
	       for (int i = 1; i <= h; ++i) 
	       {   
			
	           for (int j = 1; j <= h-i; j++) 
	        	System.out.print(" ");
	        	
	           for(int j=0;j<i*1;j++)
	           {
	        	 System.out.print("*");
	        	 System.out.print(" ");	
	           }
	         System.out.println();
	       }
	}   
	
}
