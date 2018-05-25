package com.greenfoxacademy.sqlspringpractice.factories;

import com.greenfoxacademy.sqlspringpractice.models.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoFactory {

  public Todo getEmptyTodo() {
    return new Todo();
  }
}
