package com.greenfoxacademy.sqlspringpractice.services;

import com.greenfoxacademy.sqlspringpractice.models.Todo;
import com.greenfoxacademy.sqlspringpractice.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> getAllTodos() {
    return (List<Todo>) todoRepository.findAll();
  }

  @Override
  public Todo getTodoById(int id) {
    return todoRepository.findOne(id);
  }

  @Override
  public void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void modifyTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteTodo(int id) {
    todoRepository.delete(id);
  }
}
