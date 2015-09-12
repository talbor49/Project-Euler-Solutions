package com.solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution19 {
    public static void main(String[] args) {
        //days - the number of days in the current month. dayInMonth = current day in month (on 21/12, it would be 21)
        //lastDayInMonth means the day before the current date.(Initial value is 1 because it the loop starts in 1st january 1900, a monday.
        //firstSundays counts the amount of sundays on the first on the month.
        int days = 0, dayInMonth = 0, lastDayInMonth = 1, firstSundays = 0;
        Map<Integer, Integer> months = new HashMap<Integer, Integer>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);
        Map<Integer, Integer> leapMonths = new HashMap<Integer, Integer>();
        leapMonths.put(1, 31);
        leapMonths.put(2, 29);
        leapMonths.put(3, 31);
        leapMonths.put(4, 30);
        leapMonths.put(5, 31);
        leapMonths.put(6, 30);
        leapMonths.put(7, 31);
        leapMonths.put(8, 31);
        leapMonths.put(9, 30);
        leapMonths.put(10, 31);
        leapMonths.put(11, 30);
        leapMonths.put(12, 31);
        for (int year = 1900; year < 2001; year++) {
            for (int month = 1; month <= 12; month++) {
                if (year % 100 != 0) {
                    if (year % 4 == 0)
                        days = leapMonths.get(month);
                    else
                        days = leapMonths.get(month);
                } else if (year % 400 == 0)
                    days = leapMonths.get(month);
                else
                    days = months.get(month);
                for (int day = 1; day <= days; day++) {
                    if (lastDayInMonth < 7)
                        dayInMonth = lastDayInMonth + 1;
                    else
                        dayInMonth = 1;
                    if (day == 1 && dayInMonth == day && year != 1900)
                        firstSundays++;
                    lastDayInMonth = dayInMonth;
                }
            }
        }
        System.out.println(firstSundays);
    }
}
