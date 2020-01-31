package model;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor

@Setter
@Getter
public class Student {
	@NotNull
	@Size(min = 1,max = 15)
	private String firstName;
	@NotNull
	@Size(min = 1,max=14)
	private String lastName;
	@Pattern(regexp ="^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$",message = "! ENTER THE VALID EMAIL")
	private String email;
	@Range(min = 18,max = 55 ,message="The AGE IS  not valid") 
	private int age;
	@Pattern(regexp = "^([1-9]{1})([234789]{1})([0-9]{8})$",message="! 10 numbers")
	private String phone;
	private String country;
	

private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;

	public Student() {
        countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");	
		
	}
	
	

}
