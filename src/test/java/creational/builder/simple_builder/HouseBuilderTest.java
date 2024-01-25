package creational.builder.simple_builder;

import creational.builder.simple_builder_1.House;
import creational.builder.simple_builder_1.HouseBuilder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HouseBuilderTest {

    @Test
    void name() {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.roomCount(2);
        houseBuilder.bathroomCount(1);
        House house = houseBuilder.build();

        System.out.println(house);
        assertThat(house.toString()).isEqualTo("House(roomCount=2, bathroomCount=1, hasGarden=false)");
    }
}