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
  public List<School> getAllSchoolsByEv(int ev) {
    return schoolRepository.getAllByEv(ev);
  }

  @Override
  public List<School> findByIskolaId(int iskolaId) {
    return schoolRepository.findSchoolByIskolaId(iskolaId);
  }

/*  @Override
  public List<School> sortByAbc(ArrayList<School> someSchools) {
    someSchools.sort((School x, School y) -> x.getIskolaNeve().compareTo(y.getIskolaNeve()));
    return someSchools;
  }*/

/*  @Override
  public List<School> sortByNumber(ArrayList<School> someSchools, String field) {
    if (field.equals("matek")) {
      someSchools.sort((School x, School y) -> x.getMatekFejl().compareTo(y.getMatekFejl()));
    } else if (field.equals("szoveg")) {
      someSchools.sort((School x, School y) -> x.getSzovegFejl().compareTo(y.getSzovegFejl()));
    }
    return someSchools;
  }*/

/*  @Override
  public List<School> reverseSortByAbc(ArrayList<School> someSchools) {
    someSchools.sort((School x, School y) -> y.getIskolaNeve().compareTo(x.getIskolaNeve()));
    return someSchools;
  }*/

  @Override
  public List<School> sortItAccordingly(List<School> someSchools, int field) {
    if (field == 10) {
      someSchools.sort((School x, School y) -> x.getIskolaNeve().compareTo(y.getIskolaNeve()));
      return someSchools;
    } else if (field == 11) {
      someSchools.sort((School x, School y) -> y.getIskolaNeve().compareTo(x.getIskolaNeve()));
      return someSchools;
    } else if (field == 20) {
      someSchools.sort((School x, School y) -> x.getTelepules().compareTo(y.getTelepules()));
      return someSchools;
    } else if (field == 21) {
      someSchools.sort((School x, School y) -> y.getTelepules().compareTo(x.getTelepules()));
      return someSchools;
    } else if (field == 30) {
      someSchools.sort((School x, School y) -> x.getMatekFejlAtl().compareTo(y.getMatekFejlAtl()));
      return someSchools;
    } else if (field == 31) {
      someSchools.sort((School x, School y) -> y.getMatekFejlAtl().compareTo(x.getMatekFejlAtl()));
      return someSchools;
    } else if (field == 40) {
      someSchools.sort((School x, School y) -> x.getSzovegFejlAtl().compareTo(y.getSzovegFejlAtl()));
      return someSchools;
    } else if (field == 41) {
      someSchools.sort((School x, School y) -> y.getSzovegFejlAtl().compareTo(x.getSzovegFejlAtl()));
      return someSchools;
    } else if (field == 50) {
      someSchools.sort((School x, School y) -> x.getMatekFejlAlCsh().compareTo(y.getMatekFejlAlCsh()));
      return someSchools;
    } else if (field == 51) {
      someSchools.sort((School x, School y) -> y.getMatekFejlAlCsh().compareTo(x.getMatekFejlAlCsh()));
      return someSchools;
    } else if (field == 60) {
      someSchools.sort((School x, School y) -> x.getSzovegFejlAlCsh().compareTo(y.getSzovegFejlAlCsh()));
      return someSchools;
    } else if (field == 61) {
      someSchools.sort((School x, School y) -> y.getSzovegFejlAlCsh().compareTo(x.getSzovegFejlAlCsh()));
      return someSchools;
    } else if (field == 70) {
      someSchools.sort((School x, School y) -> x.getMatekFejlMagCsh().compareTo(y.getMatekFejlMagCsh()));
      return someSchools;
    } else if (field == 71) {
      someSchools.sort((School x, School y) -> y.getMatekFejlMagCsh().compareTo(x.getMatekFejlMagCsh()));
      return someSchools;
    } else if (field == 80) {
      someSchools.sort((School x, School y) -> x.getSzovegFejlMagCsh().compareTo(y.getSzovegFejlMagCsh()));
      return someSchools;
    } else if (field == 81) {
      someSchools.sort((School x, School y) -> y.getSzovegFejlMagCsh().compareTo(x.getSzovegFejlMagCsh()));
      return someSchools;
    } else if (field == 90) {
      someSchools.sort((School x, School y) -> x.getCsaladiAtl().compareTo(y.getCsaladiAtl()));
      return someSchools;
    } else if (field == 91) {
      someSchools.sort((School x, School y) -> y.getCsaladiAtl().compareTo(x.getCsaladiAtl()));
      return someSchools;
    } else if (field == 550) {
      someSchools.sort((School x, School y) -> x.getCsaladiVar().compareTo(y.getCsaladiVar()));
      return someSchools;
    } else if (field == 551) {
      someSchools.sort((School x, School y) -> y.getCsaladiVar().compareTo(x.getCsaladiVar()));
      return someSchools;
    } else {
      return someSchools;
    }
  }

/*  @Override
  public List<School> reverseSortByNumber(ArrayList<School> someSchools, String field) {
    if (field.equals("matek")) {
      someSchools.sort((School x, School y) -> y.getMatekFejl().compareTo(x.getMatekFejl()));
    } else if (field.equals("szoveg")) {
      someSchools.sort((School x, School y) -> y.getSzovegFejl().compareTo(x.getSzovegFejl()));
    }
    return someSchools;
  }*/

}
