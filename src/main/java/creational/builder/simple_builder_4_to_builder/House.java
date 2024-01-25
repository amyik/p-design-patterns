package creational.builder.simple_builder_4_to_builder;

import lombok.ToString;

@ToString
public class House {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;

    public House(int roomCount, int bathroomCount, boolean hasGarden) {
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
        this.hasGarden = hasGarden;
    }

    public HouseBuilder toBuilder() {

        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.roomCount(this.roomCount)
                .bathroomCount(this.bathroomCount)
                .hasGarden(this.hasGarden);

        return houseBuilder;
    }
}