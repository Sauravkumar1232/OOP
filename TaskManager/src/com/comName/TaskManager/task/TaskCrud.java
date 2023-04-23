package com.comName.TaskManager.task;

import java.util.ArrayList;

public class TaskCrud {
	ArrayList<Task> taskList;
	public  TaskCrud() {
		taskList = new ArrayList<>();
	}
	
	public void addTask(String task,String des) {
		Task taskNew = new Task();
		taskNew.setTaskName(task);
		taskNew.setTaskDesc(des);
		taskList.add(taskNew);
		System.out.println(taskList);
		
	}
	
	public void deleteTask(String task) {
		taskList.remove(task);
	}
	
	public void printTask() {
		for(int i = 0; i < taskList.size(); i++) {   
		    System.out.print(taskList.get(i));
		}  
//		System.out.println(taskList);
		
		
	}
	
	public void updateTask() {
		
	}
	

}
