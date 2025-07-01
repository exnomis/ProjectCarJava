package com.betacom.car.process;

import java.util.List;

import com.betacom.car.exception.AcademyException;

public class StartCar {
	
	private ProcessMacchina mac = new ProcessMacchina();
	private ProcessMoto moc = new ProcessMoto();
	private ProcessBici bic = new ProcessBici();
	 
	public boolean execute(List<String> params) throws AcademyException {
		System.out.println("**********Begin StartCar**********");
		    for (String veicolo : params) {
		        String[] s = veicolo.split(",");
		        if (s.length > 0) {
		        	String tipoVeicolo = s[0].trim();
		        	if (tipoVeicolo.equalsIgnoreCase("macchina")) {
		        		mac.execute(s);
		        	}
		        	if (tipoVeicolo.equalsIgnoreCase("moto")) {
		        		moc.execute(s);
		        	}
		        	if (tipoVeicolo.equalsIgnoreCase("bici")) {
		        		bic.execute(s);
		        	}
		        	
		        } 
		        
		    }
	
		return true;
	}
}
