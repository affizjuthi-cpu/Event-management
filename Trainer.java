/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */



public class Trainer extends User {
    private final String specialization;

    public Trainer(int userId, String name, String email, String specialization) {
        super(userId, name, email);
        this.specialization = specialization;
    }

    public void createRoutine() {
        System.out.println("Trainer " + name + " created a routine.");
    }
}