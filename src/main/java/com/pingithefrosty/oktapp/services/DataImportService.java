package com.pingithefrosty.oktapp.services;

import com.pingithefrosty.oktapp.models.School;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class DataImportService {
  public static ArrayList<School> schoolList = new ArrayList<>();
  public static ArrayList<String> schoolsAsString = new ArrayList<>();
  public static final String CSVSEPARATOR = "|";

  public static void startImport() {
    importFile();
    createSchoolObjects();
  }

  private static void importFile() {
    String csvFile = "/data/nahalka_2012.csv";
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
    for (int i = 0; i < schoolsAsString.size() ; i++) {
      School school = new School();
      String[] columns = schoolsAsString.get(i).split(CSVSEPARATOR);
      //school.setId(Integer.parseInt(columns[0]));
      school.setName(columns[1]);
      school.setTelepules(columns[2]);
      school.setRangMat(Integer.parseInt(columns[3]));
      school.setRangMatPhe(Integer.parseInt(columns[4]));
      school.setRangSze(Integer.parseInt(columns[5]));
      school.setRangSzePhe(Integer.parseInt(columns[6]));
      school.setRangTeszt(Integer.parseInt(columns[7]));
      school.setRangPhe(Integer.parseInt(columns[8]));
      school.setOmid(Integer.parseInt(columns[9]));
      school.setTelephely(Integer.parseInt(columns[10]));
      school.setTipus(columns[11]);
      school.setAtlagMat(Float.parseFloat(columns[12]));
      school.setAtlagMatPhe(Float.parseFloat(columns[13]));
      school.setAtlagSze(Float.parseFloat(columns[14]));
      school.setAtlagSzePhe(Float.parseFloat(columns[15]));
      school.setAtlagCshi(Float.parseFloat(columns[16]));
      school.setVanMat(Integer.parseInt(columns[17]));
      school.setVanSze(Integer.parseInt(columns[18]));
      school.setVanCshi(Integer.parseInt(columns[19]));
      school.setN(Integer.parseInt(columns[20]));
      school.setAranyMat(Float.parseFloat(columns[21]));
      school.setAranySze(Float.parseFloat(columns[22]));
      school.setAranyCshi(Float.parseFloat(columns[23]));
    }
  }

}
