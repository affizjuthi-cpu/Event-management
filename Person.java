/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


public class Person {
    protected int id;
    protected String name;
    protected String contact;

    public Person(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public void getDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Contact: " + contact);
    }
}