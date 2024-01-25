package creational.builder.simple_builder_with_director_and_interface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HouseDirectorTest {

    // 동일한 Director 를 이용해 두 가지 타입의 House Builder 를 파라미터로 받아 객체를 생성한다.
    @Test
    @DisplayName("Director 를 이용해서 Real House 만들기")
    void test202401251807() {

        RealHouseBuilder realHouseBuilder = new RealHouseBuilder();
        HouseDirector.constructApartment(realHouseBuilder);
        RealHouse realHouse = realHouseBuilder.build();

        assertThat(realHouse.toString()).isEqualTo("RealHouse(type=realHouse, roomCount=3, bathroomCount=2, hasGarden=false)");
    }

    @Test
    @DisplayName("Director 를 이용해서 Toy House 만들기")
    void test202401251808() {

        ToyHouseBuilder realHouseBuilder = new ToyHouseBuilder();
        HouseDirector.constructApartment(realHouseBuilder);
        ToyHouse realHouse = realHouseBuilder.build();

        assertThat(realHouse.toString()).isEqualTo("ToyHouse(type=toyHouse, roomCount=3, bathroomCount=2, hasGarden=false)");
    }
}