package com.betacom.car.Models;

public class Moto extends Veicolo{
	private String targa; //deve essere univoca
	private Integer cc; //cilindrata
	public Moto() {
		super();
		
	}
	public Moto(Integer id, String tipoVeicolo, Integer numeroRuote, String tipoAlimentazione, String categoria,
			String colore, String marca, Integer annoProduzione, String modello, String targa, Integer cc) {
		super(id, tipoVeicolo, numeroRuote, tipoAlimentazione, categoria, colore, marca, annoProduzione, modello);
		this.targa = targa;
		this.cc = cc;
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
		return "Moto [targa=" + targa + ", cc=" + cc + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
 