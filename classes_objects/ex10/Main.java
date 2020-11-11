package simpleClasses.ex10;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AirlineArray airlineArray = new AirlineArray(new ArrayList<>());
        airlineArray.addAirlines("Minsk", "MA625", "Embraer E-175", "11:25", "Sunday");
        airlineArray.addAirlines("Berlin", "GE800", "Boeing 737-300", "17:32", "Monday");
        airlineArray.addAirlines("Milan", "ML1001", "Boeing 737-500", "01:40", "Friday");
        airlineArray.addAirlines("Istanbul", "ST250", "Embraer E-175", "05:30", "Wednesday");
        airlineArray.addAirlines("Madrid", "MA702", "Embraer E-195", "13:05", "Sunday");
        airlineArray.addAirlines("Amsterdam", "HH201", "Embraer E-175", "19:10", "Friday");
        airlineArray.addAirlines("Minsk", "MA625", "Embraer E-195", "15:00", "Friday");
        airlineArray.addAirlines("Amsterdam", "HH385", "Boeing 737-300", "12:45", "Sunday");

        System.out.println("List of all flights: ");
        airlineArray.printList();
        System.out.println(" ");

        String destination = "Amsterdam";
        System.out.println("List of flights for destination " + destination + ":");
        ArrayList<Airline> listDestination = airlineArray.getListFlightForDestination(destination);
        airlineArray.printList(listDestination);
        System.out.println(" ");

        String dayWeek = "sunday";
        System.out.println("List of flight for day of week " + dayWeek + ":");
        ArrayList<Airline> listDayWeek = airlineArray.getListFlightForDayWeek(dayWeek);
        airlineArray.printList(listDayWeek);
        System.out.println(" ");

        dayWeek = "friday";
        String time = "15:30";
        System.out.println("List for the day of the week and time above the given: ");
        ArrayList<Airline> listDayTime = airlineArray.getListForDayWeekAndTime(dayWeek, time);
        airlineArray.printList(listDayTime);
    }
}

