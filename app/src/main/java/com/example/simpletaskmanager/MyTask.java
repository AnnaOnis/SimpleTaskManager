package com.example.simpletaskmanager;

public class MyTask {
    private final String description;
    private final String dateTime;

    public MyTask(String description, String dateTime) {
        this.description = description;
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public String getDateTime() {
        return dateTime;
    }
}
