package com.company;
Car.java;

public class Car {
    String mColor;
    String mBrand;
    String mTopSpeed;
//constructor
    public Car (String color, String brand, String topSpeed) {
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }
//setters
    public void setColor(String color) {
        mColor = color;
    }
    public void setBrand(String brand) {
        mBrand = brand;
    }
    public void setTopSpeed(String topSpeed) {
        mTopSpeed = topSpeed;
    }
//getters
    public void getColor(String color) {
        mColor = color;
    }
    public void getBrand(String brand) {
        mBrand = brand;
    }
    public void getTopSpeed(String topSpeed) {
        mTopSpeed = topSpeed;
    }
//go
    public void go() {
        System.out.println("I suppose we're going now");
    }
//slow
    public void slow() {
    System.out.println("I suppose we're slowing down now");
//stop
    public void stop() {
        System.out.println("I suppose we're stopping now");
}




}