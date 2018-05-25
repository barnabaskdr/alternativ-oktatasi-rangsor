package com.greenfoxacademy.sqlspringpractice.services;

import com.greenfoxacademy.sqlspringpractice.models.Assignee;
import com.greenfoxacademy.sqlspringpractice.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService{

  @Autowired
  AssigneeRepository assigneeRepository;

  @Override
  public List<Assignee> getAllAssignees() {
    return (List<Assignee>) assigneeRepository.findAll();
  }

  @Override
  public Assignee getAssigneeById(int id) {
    return assigneeRepository.findOne(id);
  }

  /*@Override
  public Assignee loginAssignee(String name) {
    List<Assignee> assignees = assigneeRepository.findAll();
    return assigneeRepository.findOneByName(name);
  }*/

  @Override
  public void addAssginee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void modifyAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void deleteAssignee(int id) {
    assigneeRepository.delete(id);
  }

  @Override
  public List<Assignee> findByName(String name) {
    return assigneeRepository.findByName(name);
  }

  @Override
  public List<Assignee> findByEmail(String email) {
    return assigneeRepository.findByEmail(email);
  }
}
