package com.myCompany.HibOnetoOneBiDirectional;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Data
public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int albumId;
	@Column(name ="albumName")
	private String name;
	private LocalDate createLocalDate;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="ImageId")
	private Image image;
	public Album(String name, LocalDate createLocalDate) {
		super();
		this.name = name;
		this.createLocalDate = createLocalDate;
	}
	

	

}
