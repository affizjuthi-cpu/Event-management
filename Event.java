
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


import java.util.ArrayList;

public class Event {
    private final int eventId;
    private final String title;
    private final ArrayList<Session> sessions;

    public Event(int eventId, String title) {
        this.eventId = eventId;
        this.title = title;
        this.sessions = new ArrayList<>();
    }

    public void addSession(Session s) {
        sessions.add(s);
    }

    public void removeSession(Session s) {
        sessions.remove(s);
    }
}