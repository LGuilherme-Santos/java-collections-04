package br.fai.collections;

public class Cachorro extends Animal {
	
	public Cachorro(String nome) {
		setNome(nome);
	}
	
	@Override
	public void som() {
		System.out.println("eu gosto de latir");
	}
	
	public void oQueGostoDeFazer() {
		System.out.println("Gosto de morder os carteiros");
	}

}
