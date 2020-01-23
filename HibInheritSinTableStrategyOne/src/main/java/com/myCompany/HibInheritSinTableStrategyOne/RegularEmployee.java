package com.myCompany.HibInheritSinTableStrategyOne;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

@DiscriminatorValue("REGULAR                                                                                                                                                                                                                               ")
public class RegularEmployee extends Employee {
	private String monthlySAl;
	private String languages;
	private String Area;
	public RegularEmployee(String name, LocalDate salDeposited, double salary, String monthlySAl, String languages,
			String area) {
		super(name, salDeposited, salary);
		this.monthlySAl = monthlySAl;
		this.languages = languages;
		Area = area;
	}
	
	
	
	

}
