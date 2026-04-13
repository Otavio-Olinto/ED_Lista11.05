package view;

import otavioolinto.fila.Fila;
import model.Pessoa;
import controller.ParqueController;

public class Principal {

	public static void main(String[] args) {
		// Criando a fila
		Fila<Pessoa> fila = new Fila<>(Pessoa.class);
		
		// Instanciando os métodos da classe ParqueController
		ParqueController metodo = new ParqueController();
		
		for(int i=0; i<30; i++) criarPessoa(fila, i);
		
		try {
			
			metodo.brinquedo(fila);
		
		}catch(Exception exc) {
			
			System.err.println(exc.getMessage());
		}
		
		System.exit(0);

	}
	
	static void criarPessoa(Fila<Pessoa> fila, int num) {
		
		// Criando os Objetos "Pessoa"
		Pessoa pessoa = new Pessoa();
		
		// Criando o buffer de String
		StringBuffer buffer = new StringBuffer();
		
		// Criando os nome das pessoas da fila (Pessoa1, Pessoa2...)
		buffer.append("Pessoa");
		buffer.append(num+1);
		
		String nome = buffer.toString();
		
		pessoa.setName(nome);
		
		// Adicionando a altura e a idade das pessoas da fila
		int idade = (int) (Math.random()*31+10);
		pessoa.setIdade(idade);
		
		pessoa.setAltura(Math.random()*0.66+1.35);
		
		
		// Adicionando as pessoas na fila
		fila.insert(pessoa);
	}

}
