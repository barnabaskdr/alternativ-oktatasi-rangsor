package com.pingithefrosty.oktapp.services;

import com.pingithefrosty.oktapp.models.Assignee;
import com.pingithefrosty.oktapp.models.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolService {
  List<School> getAllSchools();
  School getSchoolById(int id);
  List<School> findByName(String name);

}
