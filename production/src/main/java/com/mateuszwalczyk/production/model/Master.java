package com.mateuszwalczyk.production.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Master {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int age;

    private Master(){

    }

    public Master(Long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Kierownik: " + getName() + " " + "Wiek: " + getAge();
    }

}
