/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */



public class Exercise {
    private final String name;
    private final double calories;

    public Exercise(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public void displayExercise() {
        System.out.println("Exercise: " + name + ", Calories: " + calories);
    }

    public double getCalories() {
        return calories;
    }
}