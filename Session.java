/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


public class Session {
    private final String sessionTitle;
    private final String time;

    public Session(String sessionTitle, String time) {
        this.sessionTitle = sessionTitle;
        this.time = time;
    }

    public void displaySession() {
        System.out.println("Session: " + sessionTitle + " at " + time);
    }
}