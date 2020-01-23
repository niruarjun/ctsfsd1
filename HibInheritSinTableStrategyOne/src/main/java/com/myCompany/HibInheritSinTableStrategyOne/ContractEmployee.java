package com.myCompany.HibInheritSinTableStrategyOne;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Contract")

public class ContractEmployee extends Employee {
	private String Hourlywage;
	//private String languages;
	//private String Area;

	public ContractEmployee(String name, LocalDate salDeposited, double salary, String hourlywage) {
		super(name, salDeposited, salary);
		Hourlywage = hourlywage;
	}
	

}
