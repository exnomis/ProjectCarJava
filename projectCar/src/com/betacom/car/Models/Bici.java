package com.betacom.car.Models;

public class Bici extends Veicolo{
	
	private Integer numeroMarcie; //da 1 a n
	private String tipoSospensione; //senza, mono, ...
	private Boolean pieghevole;
	public Bici() {
		super();
		
	}
	public Bici(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello, Integer numeroMarcie, String tipoSospensione, Boolean pieghevole) {
		super(id, tipoVeicolo, numeroRuote, tipoAlimentazione, categoria, colore, marca, annoProduzione, modello);
		this.numeroMarcie = numeroMarcie;
		this.tipoSospensione = tipoSospensione;
		this.pieghevole = pieghevole;
		
	}
	public Integer getNumeroMarcie() {
		return numeroMarcie;
	}
	public void setNumeroMarcie(Integer numeroMarcie) {
		this.numeroMarcie = numeroMarcie;
	}
	public String getTipoSospensione() {
		return tipoSospensione;
	}
	public void setTipoSospensione(String tipoSospensione) {
		this.tipoSospensione = tipoSospensione;
	}
	public Boolean getPieghevole() {
		return pieghevole;
	}
	public void setPieghevole(Boolean pieghevole) {
		this.pieghevole = pieghevole;
	}
	@Override
	public String toString() {
		return "Bici [numeroMarcie=" + numeroMarcie + ", tipoSospensione=" + tipoSospensione + ", pieghevole="
				+ pieghevole + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
 