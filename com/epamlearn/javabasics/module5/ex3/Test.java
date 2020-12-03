package com.epamlearn.javabasics.module5.ex3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Calendar calendar2020 = new Calendar(2020, "Belarus");
        System.out.println("All weekends and holidays for " + calendar2020.getCountry() + " on " + calendar2020.getYear() + " year");
        List<Calendar.CalendarDay> list = calendar2020.getHolidays();
        for (Calendar.CalendarDay day : list) {
            System.out.println(day);
        }
        System.out.println("Total number of red day: " + list.size());
    }
}
