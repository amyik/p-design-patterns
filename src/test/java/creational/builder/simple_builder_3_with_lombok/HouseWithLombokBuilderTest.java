package creational.builder.simple_builder_3_with_lombok;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static creational.builder.simple_builder_3_with_lombok.HouseWithLombok1.*;
import static creational.builder.simple_builder_3_with_lombok.HouseWithLombok2.*;
import static org.assertj.core.api.Assertions.assertThat;

class HouseWithLombokBuilderTest {

    @Test
    @DisplayName("lombok @Builder 를 사용한 경우")
    void name() {

        HouseWithLombok1Builder builder = HouseWithLombok1.builder();
        HouseWithLombok1 house = builder.roomCount(2).bathroomCount(1).hasGarden(true).build();

        System.out.println(house);
        assertThat(house.toString()).isEqualTo("HouseWithLombok1(roomCount=2, bathroomCount=1, hasGarden=true)");
    }

    @Test
    @DisplayName("lombok @Builder(toBuilder = true) 를 사용한 경우")
    void test202401251238() {

        HouseWithLombok2Builder builder = HouseWithLombok2.builder();
        HouseWithLombok2 house = builder.roomCount(2).bathroomCount(1).hasGarden(true).build();

        System.out.println(house);
        assertThat(house.toString()).isEqualTo("HouseWithLombok2(roomCount=2, bathroomCount=1, hasGarden=true)");

        // toBuilder 를 사용해 hasGarden 수정
        HouseWithLombok2 newHouse = house.toBuilder().hasGarden(false).build();

        System.out.println(newHouse);
        assertThat(newHouse.toString()).isEqualTo("HouseWithLombok2(roomCount=2, bathroomCount=1, hasGarden=false)");
    }
}