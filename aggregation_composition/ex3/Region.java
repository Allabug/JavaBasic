package aggregation.ex3;

import java.util.ArrayList;

public class Region {
    private String nameRegion;
    private City regionalCenter;
    private ArrayList<District> districts;
    private int area;

    public Region(String nameRegion, City regionalCenter, int area) {
        this.nameRegion = nameRegion;
        this.regionalCenter = regionalCenter;
        this.districts = new ArrayList<District>();
        this.area = area;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }


    public int getArea() {
        return area;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

}
