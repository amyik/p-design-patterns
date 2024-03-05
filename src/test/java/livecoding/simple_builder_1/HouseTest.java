package livecoding.simple_builder_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    @DisplayName("todo")
    void test202401261412() {
        House house = new House();
        house.setRoomCount(3);
        house.setBathroomCount(2);
        house.setHasGarden(true);
        assertThat(house.toString()).isEqualTo("House(roomCount=3, bathroomCount=2, hasGarden=true)");
    }

    @Test
    @DisplayName("todo")
    void test202401261416() {
        House house = new House(0, 1, false);
        House house1 = new House(0, 1);
    }

    @Test
    @DisplayName("todo")
    void test202401261419() {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.roomCount(10);
        houseBuilder.bathroomCount(5);

        House house = houseBuilder.build();
        assertThat(house.toString()).isEqualTo("House(roomCount=10, bathroomCount=5, hasGarden=false)");
    }
}