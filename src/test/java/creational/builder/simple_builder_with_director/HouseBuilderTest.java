package creational.builder.simple_builder_with_director;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HouseBuilderTest {

    @Test
    @DisplayName("디렉터를 이용해서 아파트 타입 집 만들기")
    void test202401251756() {

        HouseBuilder builder = new HouseBuilder();
        HouseDirector.constructApartment(builder);
        House apartment = builder.build();

        assertThat(apartment.toString()).isEqualTo("House(roomCount=3, bathroomCount=2, hasGarden=false)");
    }

    @Test
    @DisplayName("디렉터를 이용해서 성 타입 집 만들기")
    void test202401251759() {

        HouseBuilder builder = new HouseBuilder();
        HouseDirector.constructCastle(builder);
        House apartment = builder.build();

        assertThat(apartment.toString()).isEqualTo("House(roomCount=10, bathroomCount=5, hasGarden=true)");
    }
}