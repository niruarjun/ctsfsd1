package com.example.demo;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@ToString
@Getter
@Setter
public class ErrorMessage {
	private String message;
	private int status;
	private LocalDateTime errorTime;
	public ErrorMessage(String message, int status,LocalDateTime errorTime) {
		super();
		this.message = message;
		this.status = status;
		this.errorTime = errorTime;
	}
	

}
