package edu.najah.cap.advance.assignments.assignment1.connections;

public class ConnectionManager {

    private final ConnectionPool pool = new ConnectionPool();

    public Connection createConnection() {
        return pool.acquire();
    }

    public void closeConnection(Connection c) {
        pool.release(c);
    }
}
