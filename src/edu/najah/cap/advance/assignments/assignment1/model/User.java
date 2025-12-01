package edu.najah.cap.advance.assignments.assignment1.model;

import java.util.List;

public class User {

    private final String name;
    private final List<String> permissions;

    public User(String name, List<String> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public boolean hasPermission(String type) {
        return permissions.contains(type.toUpperCase());
    }

    public String getName() {
        return name;
    }
}
