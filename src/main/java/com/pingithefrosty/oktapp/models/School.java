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
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private int iskolaId;
  private int telephelyId;
  @Column(name = "matematika_fejlodes")
  private String matekFejl;
  @Column(name = "szovegertes_fejlodes")
  private String szovegFejl;
  @Column(name = "kitoltok_szama")
  private int n;
  private String iskolaNeve;
  @Column(name = "település")
  private String telepulesNeve;
  private int ev;

}
