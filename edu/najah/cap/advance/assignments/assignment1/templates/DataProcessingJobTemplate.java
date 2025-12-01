package edu.najah.cap.advance.assignments.assignment1.templates;

public class DataProcessingJobTemplate extends HeavyTemplate {

    public DataProcessingJobTemplate(String name, String config, String templateBody) {
        super("DATA", name, config, templateBody);
    }

    @Override
    public JobPrototype copy() {
        return new DataProcessingJobTemplate(name, config, templateBody);
    }
}
