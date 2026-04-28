/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


public class Booking {
    private final int bookingId;
    private final String date;

    public Booking(int bookingId, String date) {
        this.bookingId = bookingId;
        this.date = date;
    }

    public void confirmBooking() {
        System.out.println("Booking confirmed on " + date);
    }
}