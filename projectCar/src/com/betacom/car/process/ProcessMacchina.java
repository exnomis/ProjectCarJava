package com.betacom.car.process;

import com.betacom.car.Models.Macchina;
import com.betacom.car.exception.AcademyException;

public class ProcessMacchina {
	/*
	 * controllo dei parametri specifici
	 * i parametri della classe Veicolo devono essere generali per tutti
	 * 
	 */ 
	
	public void execute(String[] param) throws AcademyException{
		Macchina mac = new Macchina();
		try {
			mac = (Macchina) new VeicoloControl().verify(mac, param);
			System.out.println(mac.toString());
			//controllo specifico
		} catch (Exception e) {
			
		}
	}
}
