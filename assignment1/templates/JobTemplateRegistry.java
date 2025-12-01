package edu.najah.cap.advance.assignments.assignment1.templates;

import java.util.HashMap;
import java.util.Map;

public class JobTemplateRegistry {

    private final Map<String, JobPrototype> registry = new HashMap<>();

    public void register(String key, JobPrototype prototype) {
        registry.put(key, prototype);
    }

    public JobPrototype createFrom(String key) {
        JobPrototype proto = registry.get(key);
        return proto == null ? null : proto.copy();
    }
}
