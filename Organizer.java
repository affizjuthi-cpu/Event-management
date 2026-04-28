/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


public class Organizer extends Person {
    private final String orgName;

    public Organizer(int id, String name, String contact, String orgName) {
        super(id, name, contact);
        this.orgName = orgName;
    }

    public void createEvent() {
        System.out.println("Event created by " + orgName);
    }

    public void manageEvent() {
        System.out.println("Managing event...");
    }
}