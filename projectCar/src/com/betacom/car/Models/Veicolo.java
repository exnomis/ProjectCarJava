package com.betacom.car.Models;

public class Veicolo {
	private Integer id; //id univoco del record
	private String tipoVeicolo; //Vetture, Moto, Bici
	private Integer numeroRuote; // da 1 a n
	private String tipoAlimentazione; //benzina, diesel, elettrica, ibrida, manuale(bici)
	private String categoria; //strada, fuoristrada, suv...
	private String colore;
	private String marca; //fiat, audi....
	private Integer annoProduzione;
	private String modello;
	
	public Veicolo() {
		super();
	}
	public Veicolo(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello) {
		super();
		this.id = id;
		this.tipoVeicolo = tipoVeicolo;
		this.numeroRuote = numeroRuote;
		this.tipoAlimentazione = tipoAlimentazione;
		this.categoria = categoria;
		this.colore = colore;
		this.marca = marca;
		this.annoProduzione = annoProduzione;
		this.modello = modello;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoVeicolo() {
		return tipoVeicolo;
	}
	public void setTipoVeicolo(String tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}
	public Integer getNumeroRuote() {
		return numeroRuote;
	}
	public void setNumeroRuote(Integer numeroRuote) {
		this.numeroRuote = numeroRuote;
	}
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAnnoProduzione() {
		return annoProduzione;
	}
	public void setAnnoProduzione(Integer annoProduzione) {
		this.annoProduzione = annoProduzione;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", tipoVeicolo=" + tipoVeicolo + ", numeroRuote=" + numeroRuote
				+ ", tipoAlimentazione=" + tipoAlimentazione + ", categoria=" + categoria + ", colore=" + colore
				+ ", marca=" + marca + ", annoProduzione=" + annoProduzione + ", modello=" + modello + "]";
	} 
	
}
