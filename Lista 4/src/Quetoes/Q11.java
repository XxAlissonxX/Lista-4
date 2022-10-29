package Quetoes;

import java.util.Scanner;

public class Q11 {
		
	public int i,j;
	public int mat[][]= new int [3][2];
	
	
	public void lerMatri() {
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			for(j=0;j<2;j++) {
				System.out.println("Informe sua matricula: ");
				mat[i][j]=ler.nextInt();
						
			}
		}
		
		for(i=0;i<3;i++) {
			System.out.println();
			for(j=0;j<2;j++) {
				System.out.print("["+mat[i][j]+"]");
			}
		}
		
		System.out.println();
		
		for(j=0;j<2;j++) {
			System.out.println();
			for(i=0;i<3;i++) {
				System.out.print("["+mat[i][j]+"]");
			}
		}
	}
}
