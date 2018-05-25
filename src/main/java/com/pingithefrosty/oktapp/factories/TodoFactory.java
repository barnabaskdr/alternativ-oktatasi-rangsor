package com.pingithefrosty.oktapp.factories;

import com.pingithefrosty.oktapp.models.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoFactory {

  public Todo getEmptyTodo() {
    return new Todo();
  }
}
