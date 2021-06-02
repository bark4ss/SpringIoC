package com.example.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    /**
     * Getter and Setter methods
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * toString method
     */
    @Override
    public String toString() {
        return "Message: " + this.message;
    }

    private void init() {
        System.out.println("Run init method");
    }

    private void destroy() {
        System.out.println("Run destroy method");
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("Run postConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("Run preDestroy");
    }
}
