package creational.builder.simple_builder_3_with_lombok;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder(toBuilder = true)
public class HouseWithLombok2 {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;

    public HouseWithLombok2(int roomCount, int bathroomCount, boolean hasGarden) {
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
        this.hasGarden = hasGarden;
    }
}
