package aggregation.ex5;

import java.util.ArrayList;
import java.util.Comparator;

public class TourAgency {
    private String nameAgency;
    private ArrayList<TourPackage> tourPackagesList;

    public TourAgency(String nameAgency) {
        this.nameAgency = nameAgency;
        this.tourPackagesList = new ArrayList<>();
    }


    public void addTourPackage(TourPackage tourPackage) {
        tourPackagesList.add(tourPackage);
    }

    public void setNameAgency(String nameAgency) {
        this.nameAgency = nameAgency;
    }

    public void setTourPackagesList(ArrayList<TourPackage> tourPackagesList) {
        this.tourPackagesList = tourPackagesList;
    }

    public String getNameAgency() {
        return nameAgency;
    }

    public ArrayList<TourPackage> getTourPackagesList() {
        return tourPackagesList;
    }

    public void sortToursByPrice() {
        getTourPackagesList().sort(Comparator.comparing(TourPackage::getPrice));
    }

    public void sortByNumbersDay() {
        getTourPackagesList().sort(Comparator.comparing(TourPackage::getAmountDays));
    }

    public void sortByCountry() {
        getTourPackagesList().sort(Comparator.comparing(TourPackage::getCountry));
    }

    public ArrayList<TourPackage> getToursByTourType(String type) {
        ArrayList<TourPackage> tourType = new ArrayList<>();
        for (TourPackage tour : tourPackagesList) {
            if (tour.getTourType().toString().toLowerCase().equals(type.toLowerCase())) {
                tourType.add(tour);
            }
        }
        return tourType;
    }

    public ArrayList<TourPackage> getToursByTransport(String transport) {
        ArrayList<TourPackage> toursByTransport = new ArrayList<>();
        for (TourPackage tour : tourPackagesList) {
            if (tour.getTransport().toString().toLowerCase().equals(transport.toLowerCase())) {
                toursByTransport.add(tour);
            }
        }
        return toursByTransport;
    }

    public ArrayList<TourPackage> getToursByNumberDays(int number) {
        ArrayList<TourPackage> toursByNumberDays = new ArrayList<>();
        for (TourPackage tour : tourPackagesList) {
            if (tour.getAmountDays() == number) {
                toursByNumberDays.add(tour);
            }
        }
        return toursByNumberDays;
    }

    public ArrayList<TourPackage> getToursByTransportFoodNumDays(String transport, String food, int numberDays) {
        ArrayList<TourPackage> toursList = new ArrayList<>();
        for (TourPackage tour : tourPackagesList) {
            if (tour.getTransport().toString().toLowerCase().equals(transport.toLowerCase()) &&
                    tour.getFood().toString().toLowerCase().replace('_', ' ').equals(food.toLowerCase()) &&
                    tour.getAmountDays() == numberDays) {
                toursList.add(tour);
            }
        }
        return toursList;
    }

    public void printTour() {
        for (TourPackage t : tourPackagesList) {
            System.out.println(t);
        }
    }

    public void printTour(ArrayList<TourPackage> tourList) {
        for (TourPackage t : tourList) {
            System.out.println(t);
        }
    }
}
