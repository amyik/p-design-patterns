package creational.builder.simple_builder_1;

public class HouseBuilder {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;

    public void roomCount(int num) {
        this.roomCount = num;
    }

    public void bathroomCount(int num) {
        this.bathroomCount = num;
    }

    public void hasGarden(boolean has) {
        this.hasGarden = has;
    }

    public House build() {
        return new House(roomCount, bathroomCount, hasGarden);
    }
}
