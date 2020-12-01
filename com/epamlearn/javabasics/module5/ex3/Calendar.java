package com.epamlearn.javabasics.module5.ex3;

import java.time.*;
import java.util.ArrayList;

public class Calendar {
    private String country;
    private int year;
    private ArrayList<CalendarDay> daysOfYear = new ArrayList<>();

    public Calendar(int year, String country) {
        this.year = year;
        this.country = country;
        this.daysOfYear = new ArrayList<>();
        addDays(year);
    }

    private void addDays(int year) {
        LocalDate start = LocalDate.of(year, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(year, Month.DECEMBER, 31);
        while (!start.isAfter(end)) {
            daysOfYear.add(new CalendarDay(start));
            start = start.plusDays(1);
        }
    }

    public ArrayList<CalendarDay> getHolidays() {
        ArrayList<CalendarDay> redDays = new ArrayList<>();
        for (CalendarDay day : daysOfYear) {
            if (day.isRedDay()) {
                redDays.add(day);
            }
        }
        return redDays;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public class CalendarDay {

        private LocalDate date;
        private String nameHoliday;

        public CalendarDay(LocalDate holidayDate) {
            this.date = holidayDate;
            this.nameHoliday = " ";
            setNameHoliday(date);
        }

        public Boolean isWeekend() {
            if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) ||
                    date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                return true;
            }
            return false;
        }

        public Boolean isRedDay() {
            return isWeekend() || isPublicHoliday();
        }

        public Boolean isPublicHoliday() {
            LocalDate victoryDay = LocalDate.of(2020, 5, 9);
            LocalDate newYear = LocalDate.of(2020, 12, 31);
            LocalDate christmas = LocalDate.of(2020, 1, 7);
            LocalDate christmasCatholic = LocalDate.of(2020, 12, 25);
            LocalDate womanDay = LocalDate.of(2020, 3, 8);
            LocalDate independenceDay = LocalDate.of(2020, 7, 3);
            LocalDate laborHoliday = LocalDate.of(2020, 5, 1);
            LocalDate dayOctoberRevolution = LocalDate.of(2020, 11, 7);
            if (date.equals(victoryDay) || date.equals(newYear) || date.equals(christmas) ||
                    date.equals(christmasCatholic) || date.equals(womanDay) || date.equals(independenceDay) ||
                    date.equals(laborHoliday) || date.equals(dayOctoberRevolution)) {
                return true;
            }
            return false;
        }

        public String getNameHoliday() {
            return nameHoliday;
        }

        public void setNameHoliday(String nameHoliday) {
            this.nameHoliday = nameHoliday;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setNameHoliday(LocalDate localDate) {
            if (localDate.equals(LocalDate.of(2020, 5, 9))) {
                setNameHoliday("Victory day");
            } else if (localDate.equals(LocalDate.of(2020, 12, 31))) {
                setNameHoliday("New year");
            } else if (localDate.equals(LocalDate.of(2020, 1, 7))) {
                setNameHoliday("Christmas");
            } else if (localDate.equals(LocalDate.of(2020, 12, 25))) {
                setNameHoliday("Christmas");
            } else if (localDate.equals(LocalDate.of(2020, 3, 8))) {
                setNameHoliday("Women's Day");
            } else if (localDate.equals(LocalDate.of(2020, 7, 3))) {
                setNameHoliday("Independence Day");
            } else if (localDate.equals(LocalDate.of(2020, 5, 1))) {
                setNameHoliday("Day on 1 May");
            } else if (localDate.equals(LocalDate.of(2020, 11, 7))) {
                setNameHoliday("Day of the October Revolution");
            }
        }

        @Override
        public String toString() {
            return "Reed day: \n" + "date: " + date + " day of week: " + date.getDayOfWeek()
                    + "  " + getNameHoliday().toUpperCase();
        }
    }
}
