package edu.najah.cap.advance.assignments.assignment1.executor;

import edu.najah.cap.advance.assignments.assignment1.connections.Connection;
import edu.najah.cap.advance.assignments.assignment1.job.Job;

public class EmailJobStrategy implements JobStrategy {

    @Override
    public void execute(Job job, Connection conn) {
        System.out.println("Executing Email job...");
        conn.executeQuery("INSERT INTO emails VALUES ('" + job.getId() + "')");
    }
}
