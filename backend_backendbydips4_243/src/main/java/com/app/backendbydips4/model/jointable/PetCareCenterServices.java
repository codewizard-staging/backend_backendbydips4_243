package com.app.backendbydips4.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.backendbydips4.model.Manager;
import com.app.backendbydips4.model.Pet;
import com.app.backendbydips4.model.PetCareCenter;
import com.app.backendbydips4.model.PetOwner;
import com.app.backendbydips4.model.Document;
import com.app.backendbydips4.model.PetService;
import com.app.backendbydips4.enums.PetServiceType;
import com.app.backendbydips4.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"backendbydips4\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}