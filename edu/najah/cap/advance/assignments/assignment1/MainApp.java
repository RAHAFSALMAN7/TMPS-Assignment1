package edu.najah.cap.advance.assignments.assignment1;

import edu.najah.cap.advance.assignments.assignment1.connections.ConnectionManager;
import edu.najah.cap.advance.assignments.assignment1.executor.*;
import edu.najah.cap.advance.assignments.assignment1.model.User;
import edu.najah.cap.advance.assignments.assignment1.templates.TemplateManager;
import edu.najah.cap.advance.assignments.assignment1.job.Job;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        TemplateManager tm = new TemplateManager();
        ConnectionManager cm = new ConnectionManager();

        JobExecutor executor = new JobExecutor();
        JobExecutorProxy proxy = new JobExecutorProxy(executor, cm);

        User admin = new User("Admin", Arrays.asList("EMAIL", "DATA", "REPORT"));

        Job report = tm.buildReportJobTemplate("Monthly", "type=PDF").createJobInstance();
        report.setRequestedBy(admin);

        proxy.execute(report);
    }
}
