/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


public class Attendee extends Person {
    private final String email;

    public Attendee(int id, String name, String contact, String email) {
        super(id, name, contact);
        this.email = email;
    }

    public void bookEvent() {
        System.out.println("Event booked by " + name);
    }
}