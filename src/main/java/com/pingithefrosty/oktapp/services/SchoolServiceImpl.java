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
  public List<School> sortByNumber(ArrayList<School> someSchools, String field) {
    return numSortedSchoolsFromSortedNumbers(sortedNumbersFromSchools(someSchools, field), field);
  }

  @Override
  public List<School> reverseSortByAbc(ArrayList<School> someSchools) {
    Collections.reverse(sortByAbc(someSchools));
    return someSchools;
  }

  @Override
  public List<School> reverseSortByNumber(ArrayList<School> someSchools, String field) {
    Collections.reverse(sortByNumber(someSchools, field));
    return someSchools;
  }

  private ArrayList<String> sortedNumbersFromSchools(ArrayList<School> someSchools, String field) {
    ArrayList<String> schoolNumbers = new ArrayList<>();
    if (field.equals("matek")) {
      for (School someSchool : someSchools) {
        schoolNumbers.add(someSchool.getMatekFejl());
      }
    } else if (field.equals("szoveg")) {
        for (School someSchool : someSchools) {
          schoolNumbers.add(someSchool.getSzovegFejl());
      }
    }
    Collections.sort(schoolNumbers);
    return schoolNumbers;
  }

  private List<School> numSortedSchoolsFromSortedNumbers(ArrayList<String> sortedNumbers, String field) {
    ArrayList<School> sortedSchools = new ArrayList<>();
    if (field.equals("matek")) {
      for (String sortedNumber : sortedNumbers) {
        sortedSchools.add(schoolRepository.findSchoolByMatekFejl(sortedNumber));
      }
    } else if (field.equals("szoveg")) {
      for (String sortedNumber : sortedNumbers) {
        sortedSchools.add(schoolRepository.findSchoolBySzovegFejl(sortedNumber));
      }
    }
    return sortedSchools;
  }

}
