package br.fai.collections;

public abstract class Animal {

	public void som() {
		System.out.print("Este é o som padrão de animal: ");
	}

	public void dizerMeuNome() {
		System.out.println("O nome do animal é: " + getNome());
		dizerMinhaIdade();
	}

	private void dizerMinhaIdade() {
		System.out.println("Minha idade é: " + getIdade());
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	private String cor = "preto";
	private int idade = 5;
	private String nome = "Não definido";

}
