package aggregation.ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TourAgency tourAgency = new TourAgency("Coral Travel");

        tourAgency.addTourPackage(new TourPackage("Italy", "Venice", TourType.CRUISE, Transport.LINER,
                Food.All_INCLUSIVE, 14, 2670.99));
        tourAgency.addTourPackage(new TourPackage("Greece", "Athens", TourType.CRUISE, Transport.LINER,
                Food.All_INCLUSIVE, 16, 2800.00));
        tourAgency.addTourPackage(new TourPackage("Czech", "Karlovy Vary", TourType.TREATMENT, Transport.BUS,
                Food.All_INCLUSIVE, 21, 4600.00));
        tourAgency.addTourPackage(new TourPackage("Belarus", "Minsk", TourType.EXCURSIONS, Transport.BUS,
                Food.BREAKFAST, 3, 250.00));
        tourAgency.addTourPackage(new TourPackage("Spain", "Barcelona", TourType.SHOPPING, Transport.AIRCRAFT,
                Food.NOT_INCLUDED, 2, 845.55));
        tourAgency.addTourPackage(new TourPackage("Italy", "Milan", TourType.SHOPPING, Transport.TRAIN,
                Food.NOT_INCLUDED, 2, 840.00));
        tourAgency.addTourPackage(new TourPackage("Turkey", "Antalya", TourType.RECREATION, Transport.AIRCRAFT,
                Food.All_INCLUSIVE, 7, 1450.00));
        tourAgency.addTourPackage(new TourPackage("Croatia", "Zagreb", TourType.RECREATION, Transport.AIRCRAFT,
                Food.All_INCLUSIVE, 14, 2250.99));


        System.out.println("Sort by price: ");
        tourAgency.sortToursByPrice();
        tourAgency.printTour();

        System.out.println("Sort by numbers of days: ");
        tourAgency.sortByNumbersDay();
        tourAgency.printTour();

        System.out.println("Sort by countries: ");
        tourAgency.sortByCountry();
        tourAgency.printTour();

        System.out.println("Choose a tour of type tour: ");
        ArrayList<TourPackage> typeTourList = tourAgency.getToursByTourType("shopping");
        tourAgency.printTour(typeTourList);

        System.out.println("Choose a tour by type of transport: ");
        ArrayList<TourPackage> typeTransport = tourAgency.getToursByTransport("bus");
        tourAgency.printTour(typeTransport);

        System.out.println("Choose a tour by number of days: ");
        ArrayList<TourPackage> numberDays = tourAgency.getToursByNumberDays(14);
        tourAgency.printTour(numberDays);

        System.out.println("Choose a tour by type of transport, food and number of days: ");
        ArrayList<TourPackage> toursList = tourAgency.getToursByTransportFoodNumDays("liner", "all Inclusive", 14);
        tourAgency.printTour(toursList);
    }
}
