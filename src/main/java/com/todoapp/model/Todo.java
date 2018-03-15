package com.todoapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="todo")
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="todo_id")
	private int todo_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private User user;

	
	@Column(name="desc")
	@NotEmpty(message="Please enter description")
	private String desc;
	
	@Column(name="isDone")
	private boolean isDone;
	
	@Column(name="target_date")
	@NotEmpty(message="Please enter target date")
	private Date targetDate;
}
