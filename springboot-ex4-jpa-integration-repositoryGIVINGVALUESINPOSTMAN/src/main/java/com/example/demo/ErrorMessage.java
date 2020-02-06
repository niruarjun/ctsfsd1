package com.example.demo;

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
public class ErrorMessage {
	private String message;
	private int status;
	private long errorTime;
}
