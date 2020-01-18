package com.myCompany.StringDemo4;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Component("task")

public class Task { 
	private int taskId;
	private String taskName;
	private boolean isCompleted;
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", isCompleted=" + isCompleted + "]";
	}
	
	}
	
	
	


