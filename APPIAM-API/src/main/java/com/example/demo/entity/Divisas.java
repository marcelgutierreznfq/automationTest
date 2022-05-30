package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;


import lombok.Data;

@Data
@Entity
@NamedStoredProcedureQuery(name = "Car.getTotalCardsbyModelEntity", procedureName = "GET_TOTAL_CARS_BY_MODEL", parameters = {
	    @StoredProcedureParameter(mode = ParameterMode.IN, name = "model_in", type = String.class),
	    @StoredProcedureParameter(mode = ParameterMode.OUT, name = "count_out", type = Integer.class) })
public class Divisas {

	@Id
    @Column(name="sisocode")
	private String sISOCode;
	
    @Column(name="scountryname")
	private String sCountryName;

    @Column(name="scurrenciesdesc")
	private String sCurrenciesDesc;
}
