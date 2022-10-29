package Quetoes;

public class Q3 {
	
	int vet[] = new int[100];
			
	public void preencher() {
		
		for (int i = 0; i < vet.length;i++) {
			vet[i]=i;
			
		}
	}
	
	public void a() {
		preencher();
		
		for(int i = 0;i<vet.length;i++) {
			
			if (vet[i]>=0 && vet[i]%3==0) {
				
				System.out.print(vet[i]+",");
			}
		}
	}
	
	public void b() {
		preencher();
		
		for(int i = 0;i<vet.length;i++) {
			
			if (vet[i]>=0 && vet[i]%3!=0) {
				
				System.out.print(vet[i]+",");
			}
		}
	}
	
	public void c() {
		preencher();
		
		for(int i = 0;i<vet.length;i++) {
			
			if (vet[i]<0 && vet[i]%3==0) {
				
				System.out.print(vet[i]+",");
			}
		}	
	}
	
	public void d() {
		preencher();
		
		for(int i = 0;i<vet.length;i++) {
			
			if (vet[i]<0 && vet[i]%3!=0) {
				
				System.out.print(vet[i]+",");
			}
		}
		
	}
	
}
