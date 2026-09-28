package com.areth.springboot.todowebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos;
	static {
		todos.add(new Todo(1, "areth", "Todo 1", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "areth", "Todo 2", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "areth", "Todo 3", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
