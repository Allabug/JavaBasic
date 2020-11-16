package aggregation.ex5;

public enum Transport {
    AIRCRAFT,
    BUS,
    TRAIN,
    LINER;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
