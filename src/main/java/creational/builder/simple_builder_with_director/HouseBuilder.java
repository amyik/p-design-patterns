package creational.builder.simple_builder_with_director;

public class HouseBuilder {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;
    public HouseBuilder roomCount(int num) {
        this.roomCount = num;
        return this;
    }
    public HouseBuilder bathroomCount(int num) {
        this.bathroomCount = num;
        return this;
    }
    public HouseBuilder hasGarden(boolean has) {
        this.hasGarden = has;
        return this;
    }

    public House build() {
        return new House(roomCount, bathroomCount, hasGarden);
    }
}
