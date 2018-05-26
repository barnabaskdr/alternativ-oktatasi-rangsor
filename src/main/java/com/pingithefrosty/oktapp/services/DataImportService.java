package com.pingithefrosty.oktapp.services;

import com.pingithefrosty.oktapp.models.School;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class DataImportService {
  public static ArrayList<School> schoolList = new ArrayList<>();
  public static ArrayList<String> schoolsAsString = new ArrayList<>();
  public static final String CSVSEPARATOR = "\\|";

  @Autowired
  static
  SchoolService schoolService;

  public static void startImport() {
    importFile();
    createSchoolObjects();
    schoolService.addAllSchools(schoolList);
  }

  private static void importFile() {
    String csvFile = "C:\\Users\\Asus\\Git\\alternativ-oktatasi-rangsor\\data\\rangsor.csv";
    String line = "";
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
      while ((line = br.readLine()) != null) {
        schoolsAsString.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void createSchoolObjects() {
    for (int i = 1; i < schoolsAsString.size() ; i++) {
      School school = new School();
      String[] columns = schoolsAsString.get(i).split(CSVSEPARATOR);
      //school.setId(Integer.parseInt(columns[0]));
      school.setIskolaId(Integer.parseInt(columns[1]));
      school.setTelephelyId(Integer.parseInt(columns[2]));
      school.setMatekFejl(columns[3]);
      school.setSzovegFejl(columns[4]);
      school.setN(Integer.parseInt(columns[5]));
      school.setIskolaNeve(columns[6]);
      school.setTelepulesNeve(columns[7]);
      school.setEv(Integer.parseInt(columns[8]));
    }
  }

}
