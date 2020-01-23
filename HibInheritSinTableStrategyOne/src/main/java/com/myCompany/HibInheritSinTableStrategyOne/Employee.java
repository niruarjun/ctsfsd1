package com.myCompany.HibInheritSinTableStrategyOne;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor

@Entity

@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_of_the_Employee",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("normalEmpl")
@ToString

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	LocalDate salDeposited;
	double salary;
	public Employee(String name, LocalDate salDeposited, double salary) {
		super();
		this.name = name;
		this.salDeposited = salDeposited;
		this.salary = salary;
	}

	
}
