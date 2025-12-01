package edu.najah.cap.advance.assignments.assignment1.executor;

import edu.najah.cap.advance.assignments.assignment1.connections.Connection;
import edu.najah.cap.advance.assignments.assignment1.job.Job;

public class ReportGenerationStrategy implements JobStrategy {

    @Override
    public void execute(Job job, Connection conn) {
        System.out.println("Generating Report...");
        conn.executeQuery("INSERT INTO reports VALUES ('" + job.getId() + "')");
    }
}
