package aggregation.ex5;

public class TourPackage {
    private String country;
    private String city;
    private TourType tourType;
    private Transport transport;
    private Food food;
    private int amountDays;
    private double price;

    public TourPackage(String country, String city, TourType tourType, Transport transport, Food food,
                       int amountDays, double price) {
        this.country = country;
        this.city = city;
        this.tourType = tourType;
        this.transport = transport;
        this.food = food;
        this.amountDays = amountDays;
        this.price = price;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setAmountDays(int amountDays) {
        this.amountDays = amountDays;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public TourType getTourType() {
        return tourType;
    }

    public Transport getTransport() {
        return transport;
    }

    public Food getFood() {
        return food;
    }

    public int getAmountDays() {
        return amountDays;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "counry: " + country + "\ncity: " + city + "\ntour type: " + tourType +
                "\ntransport: " + transport + "\nfood: " + food + "\ndays: " + amountDays + "\nprice: " + price + "\n";
    }
}
