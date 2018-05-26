package com.pingithefrosty.oktapp.services;

import com.pingithefrosty.oktapp.models.School;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface SchoolService {
  List<School> getAllSchools();
  School getSchoolById(int id);
  List<School> findByName(String name);
  void addAllSchools(ArrayList<School> allSchools);
  void addAllSchoolsByOne (ArrayList<School> allSchools);
  List<School> getAllSchoolsByEv(int ev);
  List<School> sortByAbc(ArrayList<School> someSchools);
  List<School> sortByNumber(ArrayList<School> someSchools, String field);
  List<School> reverseSortByAbc(ArrayList<School> someSchools);
  List<School> reverseSortByNumber(ArrayList<School> someSchools, String field);

}
