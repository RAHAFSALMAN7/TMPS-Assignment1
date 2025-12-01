package edu.najah.cap.advance.assignments.assignment1.connections;

public class Connection {

    private final String id;

    public Connection(String id) {
        this.id = id;
    }

    public void executeQuery(String sql) {
        System.out.println("[Connection " + id + "] Executing: " + sql);
    }

    public String getId() {
        return id;
    }
}
