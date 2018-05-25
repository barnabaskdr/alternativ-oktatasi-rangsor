package com.pingithefrosty.oktapp.models;

import javax.persistence.*;

@Entity
@Table
public class School {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String telepules;
  private int rangMat;
  private int rangMatPhe;
  private int rangSze;
  private int rangSzePhe;
  private int rangTeszt;
  private int rangPhe;
  private int omid;
  private int telephely;
  private String tipus;
  private float atlagMat;
  private float atlagMatPhe;
  private float atlagSze;
  private float atlagSzePhe;
  private float atlagCshi;
  private int n;
  private float aranyMat;
  private float aranySze;
  private float aranyCshi;

  public School(String name, String telepules, int rangMat, int rangMatPhe, int rangSze, int rangSzePhe, int rangTeszt, int rangPhe, int omid, int telephely, String tipus, float atlagMat, float atlagMatPhe, float atlagSze, float atlagSzePhe, float atlagCshi, int n, float aranyMat, float aranySze, float aranyCshi) {
    this.name = name;
    this.telepules = telepules;
    this.rangMat = rangMat;
    this.rangMatPhe = rangMatPhe;
    this.rangSze = rangSze;
    this.rangSzePhe = rangSzePhe;
    this.rangTeszt = rangTeszt;
    this.rangPhe = rangPhe;
    this.omid = omid;
    this.telephely = telephely;
    this.tipus = tipus;
    this.atlagMat = atlagMat;
    this.atlagMatPhe = atlagMatPhe;
    this.atlagSze = atlagSze;
    this.atlagSzePhe = atlagSzePhe;
    this.atlagCshi = atlagCshi;
    this.n = n;
    this.aranyMat = aranyMat;
    this.aranySze = aranySze;
    this.aranyCshi = aranyCshi;
  }

}
