package creational.builder.simple_builder_4_to_builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HouseBuilderTest {

    @Test
    @DisplayName("toBuilder 직접 구현해서 사용해보기")
    void test202401251255() {

        HouseBuilder builder = new HouseBuilder();
        House house = builder.roomCount(2).bathroomCount(1).hasGarden(true).build();

        System.out.println(house);
        assertThat(house.toString()).isEqualTo("House(roomCount=2, bathroomCount=1, hasGarden=true)");

        // toBuilder 를 사용해 hasGarden 수정
        House newHouse = house.toBuilder().hasGarden(false).build();

        System.out.println(newHouse);
        assertThat(newHouse.toString()).isEqualTo("House(roomCount=2, bathroomCount=1, hasGarden=false)");
    }
}