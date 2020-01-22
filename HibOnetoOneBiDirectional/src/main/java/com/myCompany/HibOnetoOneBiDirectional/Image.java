package com.myCompany.HibOnetoOneBiDirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="ImageId")
	private int imagaeId;
	private String url;
	
	@OneToOne(mappedBy = "image", cascade = CascadeType.ALL)
	private Album album;

	public Image(String url) {
		super();
		this.url = url;
	}
	
	

}
