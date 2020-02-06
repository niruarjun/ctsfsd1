package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("Serial")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookNotFoundException extends RuntimeException{
	private String message;

}
