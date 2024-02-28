package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;

import org.springframework.stereotype.Repository;

import de.dhbw.softwareengineering.deinProjektname.domain.repositories.BridgeRepository;


//Muss die jeweiligen reportorys implementieren
@Repository
public class Bridges  implements BridgeRepository  {

	@Override
	public void deleteById(Long id) {
		// implementieren
		
	}



	
	/**
	 * In dem package landen die ganzen Bridges welche benutzt werden zur kommunikation
	 * zwischen den schichten.
	 */
}
