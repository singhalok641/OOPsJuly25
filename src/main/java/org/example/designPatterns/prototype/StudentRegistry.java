package org.example.designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    // <BatchName, Student Prototype>
    private Map<String, Student> map = new HashMap<>();

    void register(String key, Student student) {
        map.put(key, student);
    }

    Student get(String key) {
        if(!map.containsKey(key)) {
            throw new IllegalArgumentException("This prototype does not exist in the Registry");
        }
        return map.get(key).clone();
    }
}
