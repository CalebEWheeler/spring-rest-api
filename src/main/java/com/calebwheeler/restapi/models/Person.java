package com.calebwheeler.restapi.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="people")
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private int age;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedDate;

  //Default Contructor
  public Person() {}

  //Create Contructor
  public Person(String name, int age, Date createdDate, Date updatedDate) {
    this.name = name;
    this.age = age;
    this.createdDate = createdDate;
    this.updatedDate = updatedDate;
  }

  //Read Contructor
  public Person(long id, String name, int age, Date createdDate, Date updatedDate) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.createdDate = createdDate;
    this.updatedDate = updatedDate;
  }

  //Getters for Person
  public long getId() {return id;}
  public String getName() {return name;}
  public int getAge() {return age;}
  public Date getCreatedDate() {return createdDate;}
  public Date getUpdatedDate() {return updatedDate;}

  //Setters for Person
  public void setId(long id) {return this.id;}
  public void setName(String name) {return this.name;}
  public void setAge(int age) {return this.age;}
  public void setCreatedDate(Date createdDate) {return this.createdDate;}
  public void setUpdatedDate(Date updatedDate) {return this.updatedDate;} 
}
