package model;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Double altura;
	
	public Pessoa() {
		
		this.nome = "";
		this.idade = 0;
		this.altura = 0.0;
	}
	
	public void setName(String nome) {
		
		this.nome = nome;
	}
	
	public String getName() {
		
		return this.nome;
	}
	
	public void setIdade(int num) {
		
		this.idade = num;
	}
	
	public int getIdade() {
		
		return this.idade;
	}
	
	public void setAltura(Double num) {
		
		this.altura = num;
	}
	
	public Double getAltura() {
		
		return this.altura;
	}
	
	public String toString() {
		
		String alt = String.format("%.2f",this.altura);
		
		return this.nome+", "+this.idade+" anos, "+alt+"m de altura";
	}

}
