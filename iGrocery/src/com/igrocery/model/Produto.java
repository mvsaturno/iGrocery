package com.igrocery.model;

public class Produto {
	String nome, quantidade, categoria;
	Entidade mercado;
	float preco;
	
	public Produto() {
	}
	
	public Produto(String nome, Entidade mercado, String quantidade, float preco, String categoria ){
		this.mercado = mercado;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public Entidade getMercado() {
		return mercado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public String getQuantidade() {
		return quantidade;
	}
	
	public void setMercado(Entidade mercado) {
		this.mercado = mercado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
