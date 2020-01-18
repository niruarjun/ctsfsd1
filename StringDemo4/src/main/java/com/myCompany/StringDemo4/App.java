package com.myCompany.StringDemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     try {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	 Todo todo=context.getBean("todo",Todo.class);
    	 Task task=context.getBean("task",Task.class);
    	 task.setTaskId(233);
    	 task.setTaskName("rahdhd");
    	 task.setTask(task);
    	 System.out.println(todo);
    	 
		
	} catch (Exception e) {
		e.printStackTrace();
    }
    }}
