package aggregation.ex5;

public enum Food {
    BREAKFAST,
    All_INCLUSIVE,
    NOT_INCLUDED;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
