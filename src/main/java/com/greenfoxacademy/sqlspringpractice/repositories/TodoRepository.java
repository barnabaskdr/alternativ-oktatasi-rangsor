package com.greenfoxacademy.sqlspringpractice.repositories;

import com.greenfoxacademy.sqlspringpractice.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
