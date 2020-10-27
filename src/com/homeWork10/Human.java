package com.homeWork10;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Human)) return false;
        Human h = (Human)obj;
        return h.name == name && h.surname == surname && h.age == age;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+age;
    }
}
