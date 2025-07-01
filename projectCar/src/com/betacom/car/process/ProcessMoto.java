package com.betacom.car.process;

import com.betacom.car.Models.Moto;
import com.betacom.car.exception.AcademyException;

public class ProcessMoto {

	public void execute(String[] param) throws AcademyException{
		Moto mot = new Moto();
		try {
			mot = (Moto) new VeicoloControl().verify(mot, param);
			System.out.println(mot.toString());
			
		} catch (Exception e) {
			
		}
	}
 
}
