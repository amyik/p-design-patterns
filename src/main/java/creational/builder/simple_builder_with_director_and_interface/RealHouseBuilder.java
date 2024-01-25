package creational.builder.simple_builder_with_director_and_interface;

public class RealHouseBuilder implements HouseBuilderInterface {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;
    @Override
    public RealHouseBuilder roomCount(int num) {
        this.roomCount = num;
        return this;
    }
    @Override
    public RealHouseBuilder bathroomCount(int num) {
        this.bathroomCount = num;
        return this;
    }
    @Override
    public RealHouseBuilder hasGarden(boolean has) {
        this.hasGarden = has;
        return this;
    }

    public RealHouse build() {
        return new RealHouse(roomCount, bathroomCount, hasGarden);
    }
}
