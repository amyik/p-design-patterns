package livecoding.simple_builder_2_with_chaning.simple_builder_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HouseBuilderTest {

    @Test
    @DisplayName("todo")
    void test202401261426() {
        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.roomCount(1).bathroomCount(10).hasGarden(true).build();
        assertThat(house.toString()).isEqualTo("House(roomCount=1, bathroomCount=10, hasGarden=true)");
    }
}