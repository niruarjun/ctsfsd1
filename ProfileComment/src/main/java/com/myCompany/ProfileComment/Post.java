package com.myCompany.ProfileComment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int postId;
	String postedBy;
	LocalDate createdDt;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="comment_id")
	private List<Comment> comments = new ArrayList<>();

	public Post(String postedBy, LocalDate createdDt) {
		super();
		this.postedBy = postedBy;
		this.createdDt = createdDt;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postedBy=" + postedBy + ", createdDt=" + createdDt + ", comment=" + comments
				+ "]";
	}
	
	
	
}
