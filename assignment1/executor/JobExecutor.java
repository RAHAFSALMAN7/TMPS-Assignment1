package edu.najah.cap.advance.assignments.assignment1.executor;

import edu.najah.cap.advance.assignments.assignment1.connections.Connection;
import edu.najah.cap.advance.assignments.assignment1.job.Job;

public class JobExecutor {

    public void executeWithConnection(Job job, Connection conn) {
        JobStrategy strategy = JobStrategyFactory.getStrategy(job.getType());

        if (strategy == null) {
            System.out.println("Unknown job type.");
            return;
        }

        strategy.execute(job, conn);
    }
}
