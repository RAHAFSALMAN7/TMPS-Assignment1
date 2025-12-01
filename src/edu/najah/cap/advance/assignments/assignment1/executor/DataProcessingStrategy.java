package edu.najah.cap.advance.assignments.assignment1.executor;

import edu.najah.cap.advance.assignments.assignment1.connections.Connection;
import edu.najah.cap.advance.assignments.assignment1.job.Job;

public class DataProcessingStrategy implements JobStrategy {

    @Override
    public void execute(Job job, Connection conn) {
        System.out.println("Executing Data Processing job...");
        conn.executeQuery("SELECT * FROM data_source");
    }
}
