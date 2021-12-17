package com.example.junit.model;


public class Person {

    private String name;

    private int age;

    private String phone;

    private String favoriteFood;

    public Person (String name, int age, String phone, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

}
