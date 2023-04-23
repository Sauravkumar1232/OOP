package com.comName.TaskManager.views;

import java.util.Scanner;

import com.comName.TaskManager.task.TaskCrud;

public class Views {
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1: Enter new task");
			System.out.println("2: Print all task");
			System.out.println("3: Delete task");
			System.out.println("4: Update task");
			System.out.println("5: Exit");
			System.out.println("Enter choice");
	
	
		Scanner in = new Scanner(System.in);
		choice = in.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println("Enter Task Name");
			String task=in.next();
			System.out.println("Enter Discription");
			String dec=in.next();
			//make obj of taskcrud
			//call assTask and pass taskNamea and des
			TaskCrud tk = new TaskCrud();
			tk.addTask(task, dec);
			}
		break;
		
		case 2:{
			System.out.println("All task are   ");
			TaskCrud tk = new TaskCrud();
			tk.printTask();
			break;
			
			
		}
		case 3:{
			System.out.println("Enter TASK NAME");
			String task=in.next();
			TaskCrud tk = new TaskCrud();
			tk.deleteTask(task);
			break;
					
		}
		default:
			System.out.println("invalid");break;

		}
		}while(choice!=5);
	}

}
