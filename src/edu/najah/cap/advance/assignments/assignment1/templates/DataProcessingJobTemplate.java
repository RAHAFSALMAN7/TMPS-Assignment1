package edu.najah.cap.advance.assignments.assignment1.templates;

/**
 * Concrete prototype for data processing job templates.
 */
public class DataProcessingJobTemplate extends HeavyTemplate {

    public DataProcessingJobTemplate(String name, String config, String templateBody) {
        super("DATA", name, config, templateBody);
    }

    @Override
    public JobPrototype copy() {
        return new DataProcessingJobTemplate(this.name, this.config, this.templateBody);
    }
}
