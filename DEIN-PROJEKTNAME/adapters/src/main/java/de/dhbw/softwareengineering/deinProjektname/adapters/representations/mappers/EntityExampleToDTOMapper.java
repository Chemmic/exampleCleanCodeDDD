package de.dhbw.softwareengineering.deinProjektname.adapters.representations.mappers;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import de.dhbw.softwareengineering.deinProjektname.adapters.representations.EntityExampleDTO;
import de.dhbw.softwareengineering.deinProjektname.domain.entities.EntityExample;
//Beispiel macht keinen Sinn, da EntityExample und das DTO 1 zu 1 das gleiche sind.
//Würde benötigt werden bei komplexen Entitys die z.B. sich gegenseitig referenzieren.
//Solche Mapper lässt man im normal fall aus den entitys und dtos automatisch generieren, da wir aber bestimmte
//Zeilen anzahl schreiben müssen, macht es Sinn diese selbst zu schreiben :)
@Component
public class EntityExampleToDTOMapper implements Function<EntityExample, EntityExampleDTO> {

    @Lazy
    @Autowired
    public EntityExampleToDTOMapper() {

    }

    @Override
    public EntityExampleDTO apply(EntityExample entityExample) {
       return new EntityExampleDTO(
    		   entityExample.getId(),
    		   entityExample.getName());
    }
}
