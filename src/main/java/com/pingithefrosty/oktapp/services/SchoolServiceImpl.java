package com.pingithefrosty.oktapp.services;

import com.pingithefrosty.oktapp.models.School;
import com.pingithefrosty.oktapp.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
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
    return abcSortedSchoolsFromSortedNames(sortedNamesFromSchools(someSchools));
  }

  private ArrayList<String> sortedNamesFromSchools(ArrayList<School> someSchools) {
    ArrayList<String> schoolNames = new ArrayList<>();
    for (School someSchool : someSchools) {
      schoolNames.add(someSchool.getIskolaNeve());
    }
    Collections.sort(schoolNames);
    return schoolNames;
  }

  private List<School> abcSortedSchoolsFromSortedNames(ArrayList<String> sortedNames) {
    ArrayList<School> sortedSchools = new ArrayList<>();
    for (String sortedName : sortedNames) {
      sortedSchools.add(schoolRepository.findSchoolByIskolaNeve(sortedName));
    }
    return sortedSchools;
  }

  @Override
  public List<School> sortByNumber(ArrayList<School> someSchools) {
    return null;
  }

}
