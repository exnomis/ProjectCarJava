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
		        if (s.length == 0) continue;

		        String tipoVeicolo = s[0].trim().toLowerCase();

		        switch (tipoVeicolo) {
		            case "macchina":
		                mac.execute(s);
		                break;
		            case "moto":
		                moc.execute(s);
		                break;
		            case "bici":
		                bic.execute(s);
		                break;
		            default:
		                System.out.println("Tipo veicolo non riconosciuto: " + tipoVeicolo);
		        }
		    }



		
		
		
		return true;
	}
}
