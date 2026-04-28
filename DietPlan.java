/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */



public class DietPlan {
    private final String planName;
    private final int calorieLimit;

    public DietPlan(String planName, int calorieLimit) {
        this.planName = planName;
        this.calorieLimit = calorieLimit;
    }

    public void showPlan() {
        System.out.println("Diet Plan: " + planName + ", Limit: " + calorieLimit);
    }
}