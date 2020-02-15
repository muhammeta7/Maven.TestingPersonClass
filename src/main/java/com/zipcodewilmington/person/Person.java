package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private double height;
    private boolean wearsGlasses;
    private String eyeColor;
    private boolean isWeird;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = "Leon";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = "Leon";
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = "Blue";
    }

    public void setHairColor(String hairColor) {
        this.hairColor = "Brown";
    }

    public void setAge(int age) {
        this.age = 5;
    }

    public void setHeight(double height) {
        this.height = 2.0;
    }

    public void setIsWeird(boolean weird) {
        isWeird = weird;
    }

    public void setWearsGlasses(boolean blind) {
        wearsGlasses = blind;
    }

    public String getName() {
        return this.name;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public Integer getAge() {
        return this.age;
    }

    public Double getHeight() {
        return this.height;
    }

    public Boolean getIsWeird() {
        return this.isWeird;
    }

    public Boolean getWearsGlasses() {
        return this.wearsGlasses;
    }


}
