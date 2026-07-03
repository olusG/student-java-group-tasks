package com.classroom.tasks;

public class Task5GradebookReporter {

    public static double average(int[] scores) {
        if (scores == null || scores.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static String letterGrade(int score) {
        if (score >= 90) {
            return "A";
        }
        else if (score >= 80) {
            return "B";
        }
        else if (score >= 70) {
            return "C";
        }
        else if (score >= 60) {
            return "D";
        }
        else {
            return "F";
        }

    }

    public static boolean isPassing(int score) {
        return score >= 60;
    }
}
