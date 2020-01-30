package model;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CD implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	private String title;
	private String typo;
	private String year;
	private LocalDate day ;
	
	}
	
	


