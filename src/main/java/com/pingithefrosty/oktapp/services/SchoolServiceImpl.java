package com.pingithefrosty.oktapp.services;

import com.pingithefrosty.oktapp.models.School;
import com.pingithefrosty.oktapp.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{

  @Autowired
  SchoolRepository schoolRepository;

  @Override
  public List<School> getAllSchools() {
    return (List<School>) schoolRepository.findAll();
  }

  @Override
  public School getSchoolById(int id) {
    return schoolRepository.findOne(id);
  }

  @Override
  public List<School> findByName(String name) {
    return schoolRepository.findByName(name);
  }

  @Override
  public void addAllSchools(ArrayList<School> allSchools) {
    schoolRepository.save(allSchools);
  }

}
