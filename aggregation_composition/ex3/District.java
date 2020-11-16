package aggregation.ex3;

class District {
    private String districtName;
    private City districtCenter;

    public District(String districtName, City districtCenter) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public String getDistrictName() {
        return districtName;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public String toString() {
        return "District name: " + districtName + "; " + "District center: " + districtCenter;
    }
}
