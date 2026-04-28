/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */



import java.util.ArrayList;

public class WorkoutPlan {
    private final String goal;
    private final ArrayList<Exercise> exercises;

    public WorkoutPlan(String goal) {
        this.goal = goal;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise e) {
        exercises.add(e);
    }

    public void removeExercise(Exercise e) {
        exercises.remove(e);
    }
}