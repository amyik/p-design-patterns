package livecoding.simple_builder_2_with_chaning.simple_builder_1;

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
