package com.greenfoxacademy.sqlspringpractice.collections;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Types {

  private List<String> todoTypes;

  public Types() {
    todoTypes = Arrays.asList("Work", "Fun");
  }

  public List<String> getTodoTypes() {
    return todoTypes;
  }
}
