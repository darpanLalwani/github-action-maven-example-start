package com.darpan;

public class PrintEnv {
    public static void main(String[] args) {
        String dayOfWeek = System.getProperty("IS_RERUN"); // Access system property
        String source = "getProperty";
        if (dayOfWeek == null) {
            dayOfWeek = System.getenv("IS_RERUN"); // Fallback to environment variable
            source = "getenv";
        }
        System.out.println("Received env variable from " + source + " and IS_RERUN is: " + dayOfWeek);
    }
}
