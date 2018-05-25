package com.pingithefrosty.oktapp.controllers;

import com.pingithefrosty.oktapp.collections.Types;
import com.pingithefrosty.oktapp.factories.TodoFactory;
import com.pingithefrosty.oktapp.models.School;
import com.pingithefrosty.oktapp.models.Todo;
import com.pingithefrosty.oktapp.services.SchoolService;
import com.pingithefrosty.oktapp.services.TodoService;
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
public class SchoolController {

  @Autowired
  SchoolService schoolService;

  @GetMapping("/school")
  public String showSchools(Model model) {
    List<School> schools = schoolService.getAllSchools();
    model.addAttribute("schools", schools);
    return "schoolList";
  }

}