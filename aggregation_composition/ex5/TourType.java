package aggregation.ex5;

public enum TourType {
    RECREATION,
    EXCURSIONS,
    TREATMENT,
    SHOPPING,
    CRUISE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
