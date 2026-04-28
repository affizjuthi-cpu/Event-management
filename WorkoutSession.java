/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */



import java.util.ArrayList;

public class WorkoutSession {
    private final String date;
    private final ArrayList<Exercise> exercises;

    public WorkoutSession(String date) {
        this.date = date;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise e) {
        exercises.add(e);
    }

    public double calculateCalories() {
        double total = 0;
        for (Exercise e : exercises) {
            total += e.getCalories();
        }
        return total;
    }
}