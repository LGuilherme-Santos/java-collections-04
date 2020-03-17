package br.fai.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {

		Cachorro primeiroCachorro = new Cachorro("Tiburssinho");
		primeiroCachorro.setCor("azul");

		Cachorro segundoCachorro = new Cachorro("Aroldo");
		
		Gato primeiroGato = new Gato();
		primeiroGato.setNome("yoru");
		Gato segundoGato = new Gato("vermelho");
		segundoGato.setNome("Venus");
		
		List<Animal> listaDeAnimais = new ArrayList<Animal>();
		listaDeAnimais.add(primeiroCachorro);
		listaDeAnimais.add(segundoCachorro);
		listaDeAnimais.add(primeiroGato);
		listaDeAnimais.add(segundoGato);
		
		for(Animal animal: listaDeAnimais) {
			
			if(animal instanceof Cachorro) {
				Cachorro c = (Cachorro) animal;
				c.oQueGostoDeFazer();
			}else if(animal instanceof Gato) {
				Gato g = (Gato) animal;
				g.oQueFacoDuranteANoite();
			}
		}
		
	}

}
