package aggregation.ex3;

import java.util.ArrayList;

public class Country {
    private String nameCountry;
    private City capital;
    private ArrayList<Region> regions;

    public Country(String nameCountry, City capital) {
        this.nameCountry = nameCountry;
        this.capital = capital;
        this.regions = new ArrayList<Region>();
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public City getCapital() {
        return capital;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public int getNumberOfRegion() {
        int numberRegions = regions.size();
        return numberRegions;
    }

    public void printArea() {
        int area = 0;
        for (Region r : regions) {
            area += r.getArea();
        }
        System.out.println("The area of " + getNameCountry() + " is " + area + " square kilometers.");
    }

    public void printDistrictCenters() {
        for (Region r : regions) {
            for(District d : r.getDistricts()) {
                System.out.println("District center: " + d.getDistrictCenter());
            }
        }
    }
}
