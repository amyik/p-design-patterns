package livecoding.simple_builder_3_with_lombok.simple_builder_1;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class House {
    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;
}
