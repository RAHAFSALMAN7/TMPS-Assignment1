package edu.najah.cap.advance.assignments.assignment1.templates;

public class EmailJobTemplate extends HeavyTemplate {

    public EmailJobTemplate(String name, String config, String templateBody) {
        super("EMAIL", name, config, templateBody);
    }

    @Override
    public JobPrototype copy() {
        return new EmailJobTemplate(name, config, templateBody);
    }
}
