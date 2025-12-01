package edu.najah.cap.advance.assignments.assignment1.connections;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {

    private final int MAX = 10;
    private final Queue<Connection> available = new LinkedList<>();
    private int created = 0;

    public synchronized Connection acquire() {
        if (!available.isEmpty()) {
            return available.poll();
        }

        if (created < MAX) {
            created++;
            return new Connection("Conn-" + created);
        }

        while (available.isEmpty()) {
            try { wait(); } 
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }

        return available.poll();
    }

    public synchronized void release(Connection c) {
        available.offer(c);
        notify();
    }
}
