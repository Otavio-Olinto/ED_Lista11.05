package controller;

import otavioolinto.fila.Fila;
import model.Pessoa;

public class ParqueController {

	public ParqueController() {
		super();
	}
	
	public void brinquedo(Fila<Pessoa> fila)throws Exception {
		
		Pessoa pessoaAux;
		
		while(!fila.isEmpty()) {
			
			pessoaAux = fila.remove();
			
			if(pessoaAux.getIdade()<=16) {
				
				System.out.println("Esta pessoa não pode entrar no brinquedo.\nNão possui idade mínima para tal");
				System.out.println(pessoaAux+"\n");
			}else if(pessoaAux.getAltura()<=1.60) {
				
				System.out.println("Esta pessoa não pode entrar no brinquedo.\nNão possui altura mínima para tal");
				System.out.println(pessoaAux+"\n");
			}else {
				
				System.out.println("Esta pessoa pode entrar no brinquedo.");
				System.out.println(pessoaAux+"\n");
			}
		}
	}

}
