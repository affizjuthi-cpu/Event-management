/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */




public class Ticket {
    private final int ticketId;
    private final double price;

    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
    }

    public void generateTicket() {
        System.out.println("Ticket generated. ID: " + ticketId);
    }
}