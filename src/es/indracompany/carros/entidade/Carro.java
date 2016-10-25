package es.indracompany.carros.entidade;

import java.sql.Date;
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

public class Carro {
	
	//@Id
	//@GeneratedValue
	//@Column(name = "id_Carro")
	//private Integer id;
	//@Column(name = "modelo_Carro")
	private String modelo;
	//@Column(name = "fab_Carro")
	private String fabricante;
	//@Column(name = "cor_Carro")
	private String cor;
	//@Column(name = "ano_Carro")
	private Date ano;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}
	
	
	
}
