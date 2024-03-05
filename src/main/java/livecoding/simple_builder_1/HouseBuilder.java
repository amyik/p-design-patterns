package livecoding.simple_builder_1;

public class HouseBuilder {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;

    public void roomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public void bathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    public void hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    //%%%%%%%%%%%%%%%%%%%%
    public House build() {
        return new House(this.roomCount, this.bathroomCount, this.hasGarden);
    }
}
