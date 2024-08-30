package com.darpan;

public class PrintEnv {
    public static void main(String[] args) {
        String dayOfWeek = System.getProperty("DAY_OF_WEEK"); // Access system property
        String source = "getProperty";
        if (dayOfWeek == null) {
            dayOfWeek = System.getenv("DAY_OF_WEEK"); // Fallback to environment variable
            source = "getenv";
        }
        System.out.println("Received env variable from " + source + " and DAY_OF_WEEK is: " + dayOfWeek);
    }
}
