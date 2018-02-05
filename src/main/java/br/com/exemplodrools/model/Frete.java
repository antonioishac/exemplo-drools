package br.com.exemplodrools.model;

public class Frete {
	
	private String uf;
	private String cidade;
	private Double distancia;
	private Double calculo;
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	public Double getCalculo() {
		return calculo;
	}

	public void setCalculo(Double calculo) {
		this.calculo = calculo;
	}
}
