package com.example.demo.manager.domain.exception;

public class ManagerNotFound extends RuntimeException {
    public ManagerNotFound(String message) {
        super(message);
    }
}
