package com.greenfoxacademy.sqlspringpractice.services;

import com.greenfoxacademy.sqlspringpractice.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<Todo> getAllTodos();
  Todo getTodoById(int id);
  void addTodo(Todo todo);
  void modifyTodo(Todo todo);
  void deleteTodo(int id);
}