package com.darpan;

public class PrintEnv {
    public static void main(String[] args) {
        String dayOfWeek = System.getProperty("DAY_OF_WEEK"); // Access system property
        if (dayOfWeek == null) {
            dayOfWeek = System.getenv("DAY_OF_WEEK"); // Fallback to environment variable
        }
        System.out.println("DAY_OF_WEEK is: " + dayOfWeek);
    }
}
