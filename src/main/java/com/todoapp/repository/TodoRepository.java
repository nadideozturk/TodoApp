package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.model.Todo;

@Repository("todoRepository")
public interface TodoRepository extends JpaRepository<Todo,Long> {

}
