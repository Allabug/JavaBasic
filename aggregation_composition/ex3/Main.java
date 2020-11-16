package aggregation.ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        City capital = new City("Minsk");
        Country country = new Country("Belarus", capital);

        Region region1 = new Region("Brest region", new City("Brest"), 32786);
        Region region2 = new Region("Gomel region", new City("Gomel"), 32786);
        Region region3 = new Region("Vitebsk region", new City("Vitebsk"), 32786);
        Region region4 = new Region("Grodno region", new City("Grodno"), 32786);
        Region region5 = new Region("Minsk region", new City("Minsk"), 32786);
        Region region6 = new Region("Mogilev region", new City("Mogilev"), 32786);

        region1.addDistrict(new District("Kobrin district", new City("Kobrin")));
        region2.addDistrict(new District("Vetka district", new City("Vetka")));
        region3.addDistrict(new District("Braslav district", new City("Braslav")));
        region4.addDistrict(new District("Lida district", new City("Lida")));
        region5.addDistrict(new District("Borisov district", new City("Borisov")));
        region6.addDistrict(new District("Shklov district", new City("Shklov")));

        country.addRegion(region1);
        country.addRegion(region2);
        country.addRegion(region3);
        country.addRegion(region4);
        country.addRegion(region5);
        country.addRegion(region6);

        System.out.println("Print capital: " + country.getCapital());


        int numberRegions = country.getNumberOfRegion();
        System.out.println("Number of regions: " + numberRegions);

        country.printArea();

        country.printDistrictCenters();

    }
}
