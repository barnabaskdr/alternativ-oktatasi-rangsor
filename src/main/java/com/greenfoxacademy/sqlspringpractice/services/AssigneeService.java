package com.greenfoxacademy.sqlspringpractice.services;

import com.greenfoxacademy.sqlspringpractice.models.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {
  List<Assignee> getAllAssignees();
  Assignee getAssigneeById(int id);
//  Assignee loginAssignee(String name);
  void addAssginee(Assignee assignee);
  void modifyAssignee(Assignee assignee);
  void deleteAssignee(int id);
  List<Assignee> findByName(String name);
  List<Assignee> findByEmail(String email);
}
