package Quetoes;

public class Q12 {
	
	public char matriz[][] = new char[9][9];
	
	public void b() {
		int i,j;
	
		for(i = 0;i<9;i++) {
			for(j=0;j<9;j++) {
				
				if(i==0||i==1||i==2) {				
					matriz[i][j]='*';
				}else if(i==3||i==4||i==5) {
					matriz[i][j]='%';
				}else if(i==6||i==7||i==8) {
					matriz[i][j]='&';
				}
				
			}
				
		}
		System.out.println("\n\nAlemanha:");
		for(i=0;i<9;i++) {
			System.out.println();
			for(j=0;j<9;j++) {
				System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
		}
	}
	
	public void c() {
		
		int i,j;
		
		for(i = 0;i<9;i++) {
			for(j=0;j<9;j++) {
				
				matriz[i][j] = '*';
				
				if(i==3 && j <=2) {
					matriz[i][j]='%';
				}else if(i==4 && j <=2 ) {
					matriz[i][j]='%';
				}else if(i==5 && j <=2) {
					matriz[i][j]='%';
				}else if(i==5 && j <=2|| i==3 && j>5 || i==4 && j>5 || i==5 && j>5) {
					matriz[i][j]='%';
				}else if(i==3 && j ==3 || i==4 && j==3 || i==5 && j==3 || i==3 && j==4 || i==3 && j==5
					|| i==4 && j==3 || i==4 && j==5 || i==5 && j==3 || i==5 && j==4 || i==5 && j==5) {
					matriz[i][j]='&';
				}
				
			}
				
		}
		 System.out.println("\n\n Argentina:");
		for(i=0;i<9;i++) {
			System.out.println();
			for(j=0;j<9;j++) {
				System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
		}
		
	}
	
	public void d() {
		int i,j;
		
		for(i = 0;i<9;i++) {
			for(j=0;j<9;j++) {
				
				if(j==0||j==1||j==2) {				
					matriz[i][j]='*';
				}else if(j==3||j==4||j==5) {
					matriz[i][j]='&';
				}else if(j==6||j==7||j==8) {
					matriz[i][j]='%';
				}
				
			}
				
		}
		System.out.println("\n\nBelgica:");
		for(i=0;i<9;i++) {
			System.out.println();
			for(j=0;j<9;j++) {
				System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
		}
	}
	
	public void a() {
		
		int i,j;
		
		for(i = 0;i<9;i++) {
			for(j=0;j<9;j++) {
				
				matriz[i][j]='*';
				if(i==1 && j==4 || i==2 && j ==3 || i==2 && j ==5 || i==3 && j ==2 || i==3 && j ==6 || i==4 && j ==1
						|| i==4 && j ==7 || i==5 && j ==7 || i==5 && j ==1 || i==6 && j ==2 || i==6 && j ==6 
						|| i==7 && j ==3 || i==7 && j ==5 || i==8 && j ==4) {				
					matriz[i][j]='%';
					
				}else if(i==4&&j==3 || i==4 && j==4 || i==4 && j==5 || i==5 && j==3|| i==5 && j==4 || i==5 && j==5) {
					matriz[i][j]='&';
				}
				
			}
				
		}
		
		System.out.println("\nBrasil:");
		for(i=0;i<9;i++) {
			System.out.println();
			for(j=0;j<9;j++) {
				System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
		}
	}
}
