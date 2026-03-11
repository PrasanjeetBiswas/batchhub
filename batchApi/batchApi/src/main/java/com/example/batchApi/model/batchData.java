package com.example.batchApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class batchData {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
private String course;
private String trainer;
private String time;
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getCourse() {
    return course;
}
public void setCourse(String course) {
    this.course = course;
}
public String getTrainer() {
    return trainer;
}
public void setTrainer(String trainer) {
    this.trainer = trainer;
}
public String getTime() {
    return time;
}
public void setTime(String time) {
    this.time = time;
}
}
