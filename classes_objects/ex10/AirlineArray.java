package simpleClasses.ex10;

import simpleClasses.ex9.Book;

import java.util.ArrayList;

public class AirlineArray {
    private ArrayList<Airline> list;

    public AirlineArray(ArrayList<Airline> listNew) {
        this.list = listNew;
    }

    public void addAirlines(String destination, String flightNumber, String aircraftType, String departureTime, String dayOfWeek) {
        list.add(new Airline(destination, flightNumber, aircraftType, departureTime, dayOfWeek));
    }

    public void setList(ArrayList<Airline> list) {
        this.list = list;
    }

    public ArrayList<Airline> getList() {
        return list;
    }

    public ArrayList<Airline> getListFlightForDestination(String destination) {
        ArrayList<Airline> listDestination = new ArrayList<>();
        for (Airline a : this.list) {
            if (a.getDestination().compareToIgnoreCase(destination) == 0) {
                listDestination.add(a);
            }
        }
        return listDestination;
    }

    public ArrayList<Airline> getListFlightForDayWeek(String dayWeek) {
        ArrayList<Airline> listDayWeek = new ArrayList<>();
        for (Airline a : this.list) {
            if (a.getDayOfWeek().equalsIgnoreCase(dayWeek)) {
                listDayWeek.add(a);
            }
        }
        return listDayWeek;
    }

    public ArrayList<Airline> getListForDayWeekAndTime(String dayWeek, String time) {
        ArrayList<Airline> listDayTime = new ArrayList<>();
        for (Airline a : this.list) {
            if ((a.getDayOfWeek().equalsIgnoreCase(dayWeek)) && (a.getDepartureTime().compareTo(time) > 0)) {
                listDayTime.add(a);
            }
        }
        return listDayTime;
    }

    public void printList() {
        for (Airline a : list) {
            System.out.println(a);
        }
    }

    public void printList(ArrayList<Airline> list) {
        for (Airline a : list) {
            System.out.println(a);
        }
    }
}