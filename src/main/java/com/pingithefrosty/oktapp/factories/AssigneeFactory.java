package com.pingithefrosty.oktapp.factories;

import com.pingithefrosty.oktapp.models.Assignee;
import org.springframework.stereotype.Component;

@Component
public class AssigneeFactory {

  public Assignee getNewAssignee() {
    return new Assignee();
  }
}
