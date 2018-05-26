package com.pingithefrosty.oktapp.collections;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Years {

  private List<Integer> yearTypes;

  public Years() {
    yearTypes = Arrays.asList(2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017);
  }

  public List<Integer> getYearTypes() {
    return yearTypes;
  }
}
