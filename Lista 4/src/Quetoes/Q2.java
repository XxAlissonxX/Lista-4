package Quetoes;

public class Q2 {
	public String dia;
	public String tipo;
	public float preco;
	public float valor;
	
	
	
	public Q2(String dia, String tipo, float preco) {
		super();
		this.dia = dia;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public void calcular(String dia,float preco) {
		
		if (dia == "segunda"||dia == "terca"||dia == "quinta") {
			
			valor = preco - (preco * 0.4f);
		}else {
			
			valor = preco;
		}
		
	}
	public void ferramenta(String tipo) {
		
		calcular(dia, preco);
		
		if( tipo == "nova") {
			
			valor = valor * 1.15f;
		}else {
			valor = valor;
		}
	}
	
	public void rodar() {
		
		ferramenta(tipo);
		
		System.out.println("Valor : "  + valor);
	}
}
