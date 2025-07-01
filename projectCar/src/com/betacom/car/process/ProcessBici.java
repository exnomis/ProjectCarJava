package com.betacom.car.process;

import com.betacom.car.Models.Bici;
import com.betacom.car.exception.AcademyException;

public class ProcessBici {

	public void execute(String[] param) throws AcademyException{
		Bici bic = new Bici();
		try {
			bic = (Bici) new VeicoloControl().verify(bic, param);
			System.out.println(bic.toString());
			
		} catch (Exception e) {
			
		}
	}

}
