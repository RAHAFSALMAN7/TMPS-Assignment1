package edu.najah.cap.advance.assignments.assignment1.templates;

public class ReportJobTemplate extends HeavyTemplate {

    public ReportJobTemplate(String name, String config, String templateBody) {
        super("REPORT", name, config, templateBody);
    }

    @Override
    public JobPrototype copy() {
        return new ReportJobTemplate(name, config, templateBody);
    }
}
