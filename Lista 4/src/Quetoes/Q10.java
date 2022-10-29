package Quetoes;

import java.util.Scanner;

public class Q10 {
	
	public int soma=0;
	public int i;
	
	public void ler() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		i = ler.nextInt();
	}
	
	public void rodar() {
		
		ler();
	           
            String a = String.valueOf(i);
           
            for (int j=0; j<a.length(); ++j){
               
                String x = String.valueOf(a.charAt(j));  
               
                int b = Integer.parseInt(x);   
               
                soma += Math.pow(b,3);
            }
           
            
            if (soma == i) {
            	
            	System.out.println("E de Armstrong: " + i);
            }else {
            	System.out.println("Nao é de Armstrong!");
            }
           
        
    }  
}
