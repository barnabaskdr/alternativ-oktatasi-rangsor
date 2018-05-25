package com.greenfoxacademy.sqlspringpractice.controllers;

import com.greenfoxacademy.sqlspringpractice.factories.AssigneeFactory;
import com.greenfoxacademy.sqlspringpractice.models.Assignee;
import com.greenfoxacademy.sqlspringpractice.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AssigneeController {

  @Autowired
  AssigneeService assigneeService;
  @Autowired
  AssigneeFactory assigneeFactory;

/*  @GetMapping("")
  public String showLogin(Model model) {
    List<Assignee> assignees = assigneeService.getAllAssignees();
    model.addAttribute("assignees", assignees);
    model.addAttribute("newAssignee",assigneeFactory.getNewAssignee());
    return "login";
  }

  @PostMapping("")
  public String login(Model model, @ModelAttribute Assignee assignee) {

  }*/

  @GetMapping("/assignee")
  public String showAssignee(Model model) {
    List<Assignee> assignees = assigneeService.getAllAssignees();
    model.addAttribute("assignees", assignees);
    return "assigneeList";
  }

  @PostMapping("/assignee/add")
  public ModelAndView addAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.addAssginee(assignee);
    return new ModelAndView("redirect:/assignee/");
  }

  @GetMapping("/assignee/add")
  public String showAddAssignee(Model model) {
    List<Assignee> assignees = assigneeService.getAllAssignees();
    model.addAttribute("assignees", assignees);
    model.addAttribute("newAssignee",assigneeFactory.getNewAssignee());
    return "assigneeAdd";
  }

  @PostMapping("/assignee/delete/{assigneeId}")
  public String deleteAssignee (@PathVariable int assigneeId) {
    assigneeService.deleteAssignee(assigneeId);
    return "redirect:/assignee/";
  }

  @GetMapping("/assignee/edit/{assigneeId}")
  public String showEditAssignee(@PathVariable int assigneeId, Model model) {
    Assignee assignee = assigneeService.getAssigneeById(assigneeId);
    model.addAttribute("assignee", assignee);
    return "assigneeEdit";
  }

  @PostMapping("/assignee/edit/{assigneeId}")
  public String editAssignee(@PathVariable int assigneeId, @ModelAttribute Assignee assignee) {
    assignee.setId(assigneeId);
    assigneeService.modifyAssignee(assignee);
    return "redirect:/assignee/";
  }
}
