package edu.najah.cap.advance.assignments.assignment1.templates;

import edu.najah.cap.advance.assignments.assignment1.job.Job;

public interface JobPrototype {
    JobPrototype copy();
    Job createJobInstance();
}
