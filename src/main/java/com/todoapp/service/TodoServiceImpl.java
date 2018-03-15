package com.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.model.Todo;
import com.todoapp.repository.TodoRepository;


@Service("todoService")
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> todoList() {
		return todoRepository.findAll();
	}

}
