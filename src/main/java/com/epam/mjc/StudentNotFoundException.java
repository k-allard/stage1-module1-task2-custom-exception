package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    StudentNotFoundException(long id) {
        super("Could not find student with ID " + id);
    }
}
