package task;

import java.util.Scanner;

public class Tester {
	
	private static int MAX=5;

	public static void main(String[] args) {
		Todo todo1=new Todo(new Task1(),new RandomFortune());
		todo1.createTodo("John", "Learning Angular", false);
		
	   
		Scanner s=new Scanner(System.in);

		System.out.println(todo.getTodoDetails());
		int counter=-1;
		Todo todos[] = new Todo[MAX];
		int choice=0;
		Todo todo=new Todo();
		Todo tempTodo=null;
		do {
			System.out.println("1.add new todo.");
			System.out.println("2.display all todo");
			System.out.println("0. exit");
			System.out.print("slect your choice: ");
			choice=s.nextInt();
			switch (choice) {
			case 1:
				if(counter==MAX-1)
				{
					System.out.println("Cant not create more todo...");
					break;
				}
				System.out.print("task author: ");
				String author=s.next();
				System.out.print("task name: ");
				String taskName=s.next();
				System.out.print("Is Completed? ");
				boolean isCompleted=s.nextBoolean();
				tempTodo=todo1.createTodo(author, taskName, isCompleted);
				todos[++counter]=tempTodo;
				break;
			case 2:
				for(int i=0;i<=counter;i++)
				{
					System.out.println("\n"+todos[i].getTodoDetails());
				}
				break;
			case 0:
				System.exit(0);
				System.out.println("bye!!!!");

			default:
				System.out.println("invalid choice");
				break;
			}
		} while (choice !=0);
	

}}
