package de.dhbw.softwareengineering.deinProjektname.plugins.persistence;
import org.springframework.data.jpa.repository.JpaRepository;

import de.dhbw.softwareengineering.deinProjektname.domain.entities.EntityExample;

public interface springDataForBridge extends JpaRepository<EntityExample, Long> {

}
