package com.myCompany.StringDemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Component
public class Todo {

	
	
	
	@Value("${todo.todoId}")
	private int todoId;
	@Value("${todo.todoName}")
	private String todoName;
	@Value("${todo.todoIsCompleted}")
	private boolean isCompleted;
	@Autowired
	private Task task;
	@Override
	public String toString() {
		return "Todo [todoId=" + todoId + ", todoName=" + todoName + ", isCompleted=" + isCompleted + ", task=" + task
				+ "]";
	}
	
	

}
