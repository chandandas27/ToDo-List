package com.springproject.springapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface TodoRepository extends JpaRepositoryImplementation<Todo, Integer> {

	public List<Todo> findByUsername(String username);

}
