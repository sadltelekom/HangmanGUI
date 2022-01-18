package com.example.HangmanGUI;

public class Person {

    private String firstName;
    private String lastName;

    private String favouriteFood;

    public Person(String firstName, String lastName, String favouriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }
}
