package livecoding.simple_builder_3_with_lombok.simple_builder_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {


    @Test
    @DisplayName("todo")
    void test202401261422() {
        House.HouseBuilder builder = House.builder();

        House house= builder.roomCount(3)
                .hasGarden(false).build();

        assertThat(house.toString()).isEqualTo("House(roomCount=3, bathroomCount=0, hasGarden=false)");
    }
}