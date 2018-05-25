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
  private int vanMat;
  private int vanSze;
  private int vanCshi;
  private int n;
  private float aranyMat;
  private float aranySze;
  private float aranyCshi;

  public School(String name, String telepules, int rangMat, int rangMatPhe, int rangSze, int rangSzePhe, int rangTeszt, int rangPhe, int omid, int telephely, String tipus, float atlagMat, float atlagMatPhe, float atlagSze, float atlagSzePhe, float atlagCshi, int vanMat, int vanSze, int vanCshi, int n, float aranyMat, float aranySze, float aranyCshi) {
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
    this.vanMat = vanMat;
    this.vanSze = vanSze;
    this.vanCshi = vanCshi;
    this.n = n;
    this.aranyMat = aranyMat;
    this.aranySze = aranySze;
    this.aranyCshi = aranyCshi;
  }

  public School() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTelepules() {
    return telepules;
  }

  public void setTelepules(String telepules) {
    this.telepules = telepules;
  }

  public int getRangMat() {
    return rangMat;
  }

  public void setRangMat(int rangMat) {
    this.rangMat = rangMat;
  }

  public int getRangMatPhe() {
    return rangMatPhe;
  }

  public void setRangMatPhe(int rangMatPhe) {
    this.rangMatPhe = rangMatPhe;
  }

  public int getRangSze() {
    return rangSze;
  }

  public void setRangSze(int rangSze) {
    this.rangSze = rangSze;
  }

  public int getRangSzePhe() {
    return rangSzePhe;
  }

  public void setRangSzePhe(int rangSzePhe) {
    this.rangSzePhe = rangSzePhe;
  }

  public int getRangTeszt() {
    return rangTeszt;
  }

  public void setRangTeszt(int rangTeszt) {
    this.rangTeszt = rangTeszt;
  }

  public int getRangPhe() {
    return rangPhe;
  }

  public void setRangPhe(int rangPhe) {
    this.rangPhe = rangPhe;
  }

  public int getOmid() {
    return omid;
  }

  public void setOmid(int omid) {
    this.omid = omid;
  }

  public int getTelephely() {
    return telephely;
  }

  public void setTelephely(int telephely) {
    this.telephely = telephely;
  }

  public String getTipus() {
    return tipus;
  }

  public void setTipus(String tipus) {
    this.tipus = tipus;
  }

  public float getAtlagMat() {
    return atlagMat;
  }

  public void setAtlagMat(float atlagMat) {
    this.atlagMat = atlagMat;
  }

  public float getAtlagMatPhe() {
    return atlagMatPhe;
  }

  public void setAtlagMatPhe(float atlagMatPhe) {
    this.atlagMatPhe = atlagMatPhe;
  }

  public float getAtlagSze() {
    return atlagSze;
  }

  public void setAtlagSze(float atlagSze) {
    this.atlagSze = atlagSze;
  }

  public float getAtlagSzePhe() {
    return atlagSzePhe;
  }

  public void setAtlagSzePhe(float atlagSzePhe) {
    this.atlagSzePhe = atlagSzePhe;
  }

  public float getAtlagCshi() {
    return atlagCshi;
  }

  public void setAtlagCshi(float atlagCshi) {
    this.atlagCshi = atlagCshi;
  }

  public int getVanMat() {
    return vanMat;
  }

  public void setVanMat(int vanMat) {
    this.vanMat = vanMat;
  }

  public int getVanSze() {
    return vanSze;
  }

  public void setVanSze(int vanSze) {
    this.vanSze = vanSze;
  }

  public int getVanCshi() {
    return vanCshi;
  }

  public void setVanCshi(int vanCshi) {
    this.vanCshi = vanCshi;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public float getAranyMat() {
    return aranyMat;
  }

  public void setAranyMat(float aranyMat) {
    this.aranyMat = aranyMat;
  }

  public float getAranySze() {
    return aranySze;
  }

  public void setAranySze(float aranySze) {
    this.aranySze = aranySze;
  }

  public float getAranyCshi() {
    return aranyCshi;
  }

  public void setAranyCshi(float aranyCshi) {
    this.aranyCshi = aranyCshi;
  }
}
