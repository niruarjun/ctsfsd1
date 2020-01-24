package com.myCompany.ProfileComment;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment /* extends Post */ {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int commentId;
	String commentTxt;
	LocalDateTime cmtDtT;
		 

	public Comment(String commentTxt, LocalDateTime cmtDtT) {
		this.commentTxt = commentTxt;
		this.cmtDtT = cmtDtT;
	}
	
	
}
	
	

