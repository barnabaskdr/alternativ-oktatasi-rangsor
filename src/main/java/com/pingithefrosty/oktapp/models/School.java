package com.pingithefrosty.oktapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class School {

  @Id
  private int id;
  private int iskolaId;
  private int telephelyId;
  @Column(name = "matematika_fejlodes_atlag")
  private String matekFejlAtl;
  @Column(name = "szovegertes_fejlodes_atlag")
  private String szovegFejlAtl;
  @Column(name = "matematika_fejlodes_al_csh")
  private String matekFejlAlCsh;
  @Column(name = "szovegertes_fejlodes_al_csh")
  private String szovegFejlAlCsh;
  @Column(name = "matematika_fejlodes_mag_csh")
  private String matekFejlMagCsh;
  @Column(name = "szovegertes_fejlodes_mag_csh")
  private String szovegFejlMagCsh;
  @Column(name = "kitoltok_szama")
  private int kitoltok;
  @Column(name = "kitoltok_szama_al_csh")
  private int kitoltokAlCsh;
  @Column(name = "kitoltok_szama_mag_csh")
  private int kitoltokMagCsh;
  @Column(name = "csaladihatter_atlag")
  private String csaladiAtl;
  @Column(name = "csaladihatter_variancia")
  private String csaladiVar;
  private String iskolaNeve;
  @Column(name = "település")
  private String telepules;
  private int ev;

}
