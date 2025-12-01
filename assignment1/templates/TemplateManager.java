package edu.najah.cap.advance.assignments.assignment1.templates;

public class TemplateManager {

    private final JobTemplateRegistry registry = new JobTemplateRegistry();

    private String buildKey(String type, String name) {
        return type + ":" + name;
    }

    private String heavyLoad(String msg) {
        System.out.println("Loading template: " + msg);
        try { Thread.sleep(3000); } catch (Exception ignored) {}
        return "TEMPLATE_BODY";
    }

    public HeavyTemplate buildEmailJobTemplate(String name, String config) {
        String key = buildKey("EMAIL", name);
        JobPrototype proto = registry.createFrom(key);

        if (proto == null) {
            proto = new EmailJobTemplate(name, config, heavyLoad(name));
            registry.register(key, proto);
        }
        return (HeavyTemplate) proto.copy();
    }

    public HeavyTemplate buildDataProcessingTemplate(String name, String config) {
        String key = buildKey("DATA", name);
        JobPrototype proto = registry.createFrom(key);

        if (proto == null) {
            proto = new DataProcessingJobTemplate(name, config, heavyLoad(name));
            registry.register(key, proto);
        }
        return (HeavyTemplate) proto.copy();
    }

    public HeavyTemplate buildReportJobTemplate(String name, String config) {
        String key = buildKey("REPORT", name);
        JobPrototype proto = registry.createFrom(key);

        if (proto == null) {
            proto = new ReportJobTemplate(name, config, heavyLoad(name));
            registry.register(key, proto);
        }
        return (HeavyTemplate) proto.copy();
    }
}
