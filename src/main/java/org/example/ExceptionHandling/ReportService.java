package org.example.ExceptionHandling;

import java.io.IOException;

public class ReportService {
    public void generateReport(String path) throws IOException {
        if(path == null || path.isBlank()) {
            throw new IllegalArgumentException("Path must be set"); // unchecked exception
        }

        // May throw IOException during file operations
        // Caller handles this via try/catch or further throws
        new ConfigLoader().readFirstLine(path);
    }
}
