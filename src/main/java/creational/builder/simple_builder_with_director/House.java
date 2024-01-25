package creational.builder.simple_builder_with_director;

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
}
