package com.pingithefrosty.oktapp.services;

import com.pingithefrosty.oktapp.models.School;
import com.pingithefrosty.oktapp.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

  @Autowired
  SchoolRepository schoolRepository;

  @Override
  public List<School> getAllSchools() {
    return (List<School>) schoolRepository.findAll();
  }

  @Override
  public ArrayList<School> getAllSchoolsAsArray() {
    return (ArrayList<School>) schoolRepository.findAll();
  }

  @Override
  public School getSchoolById(int id) {
    return schoolRepository.findOne(id);
  }

  @Override
  public List<School> findByName(String name) {
    return null;
  }

  @Override
  public void addAllSchools(ArrayList<School> allSchools) {
    schoolRepository.save(allSchools);
  }

  @Override
  public void addAllSchoolsByOne(ArrayList<School> allSchools) {
    for (int i = 0; i < allSchools.size(); i++) {
      schoolRepository.save(allSchools.get(i));
    }
  }

  @Override
  public List<School> getAllSchoolsByEv(int ev) {
    return schoolRepository.getAllByEv(ev);
  }

  @Override
  public List<School> sortByAbc(ArrayList<School> someSchools) {
    someSchools.sort((School x, School y) -> x.getIskolaNeve().compareTo(y.getIskolaNeve()));
    return someSchools;
  }

  @Override
  public List<School> sortByNumber(ArrayList<School> someSchools, String field) {
    if (field.equals("matek")) {
      someSchools.sort((School x, School y) -> x.getMatekFejl().compareTo(y.getMatekFejl()));
    } else if (field.equals("szoveg")) {
      someSchools.sort((School x, School y) -> x.getSzovegFejl().compareTo(y.getSzovegFejl()));
    }
    return someSchools;
  }

  @Override
  public List<School> reverseSortByAbc(ArrayList<School> someSchools) {
    someSchools.sort((School x, School y) -> y.getIskolaNeve().compareTo(x.getIskolaNeve()));
    return someSchools;
  }

  @Override
  public List<School> reverseSortByNumber(ArrayList<School> someSchools, String field) {
    if (field.equals("matek")) {
      someSchools.sort((School x, School y) -> y.getMatekFejl().compareTo(x.getMatekFejl()));
    } else if (field.equals("szoveg")) {
      someSchools.sort((School x, School y) -> y.getSzovegFejl().compareTo(x.getSzovegFejl()));
    }
    return someSchools;
  }

}
