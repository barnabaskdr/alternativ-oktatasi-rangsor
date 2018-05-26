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
  private String matekFejl;
  private String szovegFejl;
  private int n;
  private String iskolaNeve;
  private String telepulesNeve;
  private int ev;

}
