package com.betacom.car.Models;

public class Macchina extends Veicolo{
	private Integer numeroPorte;
	private String targa; //deve essere univoca
	private Integer cc; //cilindrata
	
	public Macchina() {
		super();
		
	} 
	public Macchina(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello, Integer numeroPorte, String targa, Integer cc) {
		super(id, tipoVeicolo, numeroRuote, tipoAlimentazione, categoria, colore, marca, annoProduzione, modello);
		this.numeroPorte = numeroPorte;
		this.targa = targa;
		this.cc = cc;
		
	}
	public Integer getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(Integer numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Macchina [numeroPorte=" + numeroPorte + ", targa=" + targa + ", cc=" + cc + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
