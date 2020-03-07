package br.com.impacta.despesaswebjava.models;

import java.time.LocalDate;

public class Despesa {
	
	private String descricao;
	private CategoriaDespesa categoria;
	private LocalDate data;
	private double valor;
	private String observacoes;
	
	public Despesa(String descricao, CategoriaDespesa categoria, LocalDate data, double valor) {
		super();
		this.descricao = descricao;
		this.categoria = categoria;
		this.data = data;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaDespesa getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDespesa categoria) {
		this.categoria = categoria;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
	

}
