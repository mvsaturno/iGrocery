package com.igrocery.model;

public class Entidade {
	
	String cidade, nome;
	
	public Entidade() {
		// TODO Auto-generated constructor stub
	}
	
	public Entidade(String cidade, String nome) {
		this.cidade = cidade;
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
