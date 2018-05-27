package com.pingithefrosty.oktapp.controllers;

import com.pingithefrosty.oktapp.collections.Telepulesek;
import com.pingithefrosty.oktapp.collections.Years;
import com.pingithefrosty.oktapp.models.School;
import com.pingithefrosty.oktapp.models.StaticSchools;
import com.pingithefrosty.oktapp.services.DataImportService;
import com.pingithefrosty.oktapp.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SchoolController {

  final
  SchoolService schoolService;

  final
  Years years;

  final
  Telepulesek telepulesek;

  @Autowired
  public SchoolController(SchoolService schoolService, Years years, Telepulesek telepulesek) {
    this.schoolService = schoolService;
    this.years = years;
    this.telepulesek = telepulesek;
  }

  @GetMapping("/")
  public String showStartPage(Model model) {
    return "startPage";
  }

  @GetMapping("/schools")
  public String showSchools(@RequestParam(value = "search", required = false, defaultValue = "0") int search, Model model) {
    if (StaticSchools.staticSchools.isEmpty()) {
      ArrayList<School> allSchools = schoolService.getAllSchoolsAsArray();
      StaticSchools.staticSchools.addAll(allSchools);
      List<School> schools = schoolService.sortItAccordingly(allSchools, search);
      model.addAttribute("schools", schools);
    } else {
      List<School> schools = schoolService.sortItAccordingly(StaticSchools.staticSchools, search);
      model.addAttribute("schools", schools);
    }
    return "schoolList";
  }

  @GetMapping("/schools/{iskolaId}")
  public String displaySchool(@PathVariable int iskolaId, Model model) {
    model.addAttribute("schools", schoolService.findByIskolaId(iskolaId));
    return "displaySchool";
  }


  @GetMapping("/search")
  public String showSearch(Model model) {
    model.addAttribute("yearTypes", years.getYearTypes());
    model.addAttribute("telepulesTypes", telepulesek.getTelepulesTypes());
    return "searchPage";
  }



}