package edu.najah.cap.advance.assignments.assignment1.executor;

public class JobStrategyFactory {

    public static JobStrategy getStrategy(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL": return new EmailJobStrategy();
            case "DATA": return new DataProcessingStrategy();
            case "REPORT": return new ReportGenerationStrategy();
            default: return null;
        }
    }
}
