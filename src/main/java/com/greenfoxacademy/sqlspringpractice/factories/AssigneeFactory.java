package com.greenfoxacademy.sqlspringpractice.factories;

import com.greenfoxacademy.sqlspringpractice.models.Assignee;
import org.springframework.stereotype.Component;

@Component
public class AssigneeFactory {

  public Assignee getNewAssignee() {
    return new Assignee();
  }
}
