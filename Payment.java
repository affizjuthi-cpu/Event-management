/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

   

public class Payment {
    private final double amount;
    private final String status;

    public Payment(double amount, String status) {
        this.amount = amount;
        this.status = status;
    }

    public void processPayment() {
        System.out.println("Payment of " + amount + " is " + status);
    }
}