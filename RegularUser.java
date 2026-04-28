/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


public class RegularUser extends User {
    private final String fitness;

    public RegularUser(int userId, String name, String email, String fitness) {
        super(userId, name, email);
        this.fitness = fitness;
    }

    public void viewPlans() {
        System.out.println(name + " is viewing workout plans.");
    }
}