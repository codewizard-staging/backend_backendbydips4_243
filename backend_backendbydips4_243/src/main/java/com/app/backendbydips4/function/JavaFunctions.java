package com.app.backendbydips4.function;

import com.app.backendbydips4.model.Manager;
import com.app.backendbydips4.model.Pet;
import com.app.backendbydips4.model.PetCareCenter;
import com.app.backendbydips4.model.PetOwner;
import com.app.backendbydips4.model.Document;
import com.app.backendbydips4.model.PetService;
import com.app.backendbydips4.enums.PetServiceType;
import com.app.backendbydips4.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.backendbydips4.repository.PetServiceRepository;
import com.app.backendbydips4.repository.PetOwnerRepository;
import com.app.backendbydips4.repository.PetCareCenterRepository;
import com.app.backendbydips4.repository.ManagerRepository;
import com.app.backendbydips4.repository.DocumentRepository;
import com.app.backendbydips4.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
