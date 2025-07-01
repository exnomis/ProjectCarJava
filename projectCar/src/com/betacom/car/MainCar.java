package com.betacom.car;

import java.util.ArrayList;
import java.util.List;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.process.StartCar;

public class MainCar {

	public static void main(String[] args) throws AcademyException {
		//parametri per lanciare l'applicazione
		/*private Integer id; //id univoco del record classe singleton!!!
	      private String tipoVeicolo; //Vetture, Moto, Bici
	      private Integer numeroRuote; // da 1 a n
	      private String tipoAlimentazione; //benzina, diesel, elettrica, ibrida, manuale(bici)
	      private String categoria; //strada, fuoristrada, suv...
	      private String colore;
	      private String marca; //fiat, audi....
	      private Integer annoProduzione;
	      private String modello; */
		
		List<String> params = new ArrayList<String>();
		
		params.add("Macchina,4,benzina,strada,verde,fiat,2005,fiat500,4,targa,cc");
		params.add("Moto,2,benzina,strada,bianca,ducati,1998,ducatisium,targa,cc");
		params.add("Bici,2,manuale,strada,rossa,bicik,2024,bicick89,5,sospensione,false");
		
		
		
		if (new StartCar().execute(params)) {
			System.out.println("**********Fine normale**********");
		} else {
			System.out.println("**********Error found**********");
		}

	}

}
