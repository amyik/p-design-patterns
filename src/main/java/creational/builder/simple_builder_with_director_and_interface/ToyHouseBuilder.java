package creational.builder.simple_builder_with_director_and_interface;

public class ToyHouseBuilder implements HouseBuilderInterface {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;
    @Override
    public HouseBuilderInterface roomCount(int num) {
        this.roomCount = num;
        return this;
    }
    @Override
    public HouseBuilderInterface bathroomCount(int num) {
        this.bathroomCount = num;
        return this;
    }
    @Override
    public HouseBuilderInterface hasGarden(boolean has) {
        this.hasGarden = has;
        return this;
    }

    public ToyHouse build() {
        return new ToyHouse(roomCount, bathroomCount, hasGarden);
    }
}
