package Quetoes;

public class Q5 {
	
	public int vet1[]={1,2,3};
	public int vet2[]={4,5,6};
	public int vet3[]={7,8,9};
	public int vetS[]=new int [vet1.length];
	public int vetP[]=new int [vet1.length];
	public int vetM[]=new int [vet1.length];
	
	public void soma() {
		
		System.out.println("Soma de cada vetor:");
		int soma1=0;
		int soma2=0;
		int soma3=0;
		int j=0;
		
		for (int i=0;i<vet1.length;i++) {
			soma1=vet1[i]+soma1;
		}
		
		System.out.println(soma1);
		vetS[j]=soma1;
		j++;
		
		for (int i=0;i<vet2.length;i++) {
			soma2=vet2[i]+soma2;
		}
		System.out.println(soma2);
		vetS[j]=soma2;
		j++;
		
		for (int i=0;i<vet3.length;i++) {
			soma3=vet3[i]+soma3;
		}
		System.out.println(soma3);
		vetS[j]=soma3;
		
		int total = 0;
		for (int i=0;i<vetS.length;i++) {
			total = total + vetS[i];
		}
		System.out.println("\nSoma total: " + total);
		
	}
	
	public void produto() {
		
		System.out.println("\nProduto de cada vetor:");
		int produto1=1;
		int produto2=1;
		int produto3=1;
		int j=0;
		
		for (int i=0;i<vet1.length;i++) {
			produto1=vet1[i]*produto1;
		}
		System.out.println(produto1);
		vetP[j]=produto1;
		j++;
		
		
		for (int i=0;i<vet2.length;i++) {
			produto2=vet2[i]*produto2;
		}
		System.out.println(produto2);
		vetP[j]=produto2;
		j++;
		
		for (int i=0;i<vet3.length;i++) {
			produto3=vet3[i]*produto3;
		}
		System.out.println(produto3);
		vetP[j]=produto1;
		
		int total = 1;
		for (int i=0;i<vetP.length;i++) {
			total = total * vetP[i];
		}
		System.out.println("\nProduto total: " + total);
	}
	
	public void media() {
		System.out.println("\nMedia de cada vetor:");
		int media1=0;
		int media2=0;
		int media3=0;
		int j=0;
		int i=0;
		
		media1=vetS[j]/3;
		j++;
		System.out.println(media1);
		vetM[i]=media1;
		i++;
		
		media2=vetS[j]/3;
		j++;
		System.out.println(media2);
		vetM[i]=media2;
		i++;
		
		media3=vetS[j]/3;
		System.out.println(media3);
		vetM[i]=media3;
		
		float mtotal = 0;
		for(int h=0;h<vetM.length;h++) {
			mtotal = mtotal + vetM[h];
		}
		mtotal =mtotal /3;
		System.out.println("\nMedia Total: "+ mtotal);
	}
	public void rodar() {
		soma();
		produto();
		media();
		
		
	}
		
}
