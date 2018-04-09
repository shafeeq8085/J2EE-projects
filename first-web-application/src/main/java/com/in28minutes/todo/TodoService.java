package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		
		todos.add(new Todo("Learn Java","Technology"));
		todos.add(new Todo("Learn JSP","Technology"));
		todos.add(new Todo("Learn Hibernate","Technology"));
		
	}
	
	public List<Todo> RetrieveTodos(){
		return todos;
	}
	
	public void AddTodo(Todo todo){
		todos.add(todo);
	}

	public void DeleteTodo(Todo todo) {
		// TODO Auto-generated method stub
		todos.remove(todo);
	}
}
