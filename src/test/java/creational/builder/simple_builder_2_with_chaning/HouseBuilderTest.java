package creational.builder.simple_builder_2_with_chaning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HouseBuilderTest {

    @Test
    void name() {

        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.roomCount(2).bathroomCount(1).hasGarden(true).build();

        System.out.println(house);
        assertThat(house.toString()).isEqualTo("House(roomCount=2, bathroomCount=1, hasGarden=true)");
    }
}