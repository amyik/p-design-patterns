package livecoding.simple_builder_2_with_chaning.simple_builder_1;

public class HouseBuilder {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;

    public HouseBuilder roomCount(int roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    public HouseBuilder bathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
        return this;
    }

    public HouseBuilder hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    //%%%%%%%%%%%%%%%%%%%%
    public House build() {
        return new House(this.roomCount, this.bathroomCount, this.hasGarden);
    }
}
