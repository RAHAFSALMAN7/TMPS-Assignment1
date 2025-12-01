package edu.najah.cap.advance.assignments.assignment1.executor;

import edu.najah.cap.advance.assignments.assignment1.connections.Connection;
import edu.najah.cap.advance.assignments.assignment1.connections.ConnectionManager;
import edu.najah.cap.advance.assignments.assignment1.job.Job;
import edu.najah.cap.advance.assignments.assignment1.model.User;

public class JobExecutorProxy {

    private final JobExecutor realExecutor;
    private final ConnectionManager cm;

    public JobExecutorProxy(JobExecutor executor, ConnectionManager cm) {
        this.realExecutor = executor;
        this.cm = cm;
    }

    public void execute(Job job) {
        User user = job.getRequestedBy();

        if (user == null) {
            System.out.println("Missing user.");
            return;
        }

        if (!user.hasPermission(job.getType())) {
            System.out.println("User lacks permission.");
            return;
        }

        long start = System.currentTimeMillis();
        Connection conn = cm.createConnection();

        try {
            realExecutor.executeWithConnection(job, conn);
        }
        finally {
            cm.closeConnection(conn);
            System.out.println("Execution took: " + (System.currentTimeMillis() - start) + "ms");
        }
    }
}
