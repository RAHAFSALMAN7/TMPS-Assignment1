package edu.najah.cap.advance.assignments.assignment1.templates;

import edu.najah.cap.advance.assignments.assignment1.job.Job;

public abstract class HeavyTemplate implements JobPrototype {

    protected final String type;
    protected final String name;
    protected final String config;
    protected final String templateBody;

    protected HeavyTemplate(String type, String name, String config, String templateBody) {
        this.type = type;
        this.name = name;
        this.config = config;
        this.templateBody = templateBody;
    }

    @Override
    public Job createJobInstance() {
        String id = templateBody + "_" + type + "_" + System.currentTimeMillis();
        return new Job(id, type, name, config);
    }
}
