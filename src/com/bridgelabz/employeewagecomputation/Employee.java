package com.bridgelabz.employeewagecomputation;

public class Employee {
    public static int attendanceCheck() {
        int attendanceCheck;
        int wage = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int totalWage;

        attendanceCheck = (int) (Math.random() * 10) % 3;
        System.out.println(attendanceCheck);

        if (attendanceCheck == 1) {
            totalWage = partTimeHour*wage;

        } else if (attendanceCheck == 2) {
            totalWage = fullTimeHour*wage;
        } else {
            totalWage = 0;
        }
        return totalWage;

    }
}
