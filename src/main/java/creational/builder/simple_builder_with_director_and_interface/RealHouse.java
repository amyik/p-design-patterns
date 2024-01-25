package creational.builder.simple_builder_with_director_and_interface;

import lombok.ToString;

@ToString
public class RealHouse {

    private String type = "realHouse";
    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;

    public RealHouse(int roomCount, int bathroomCount, boolean hasGarden) {
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
        this.hasGarden = hasGarden;
    }
}
