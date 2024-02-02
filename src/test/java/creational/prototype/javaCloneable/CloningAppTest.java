package creational.prototype.javaCloneable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CloningAppTest {

    @Test
    @DisplayName("primitive int type 값 비교")
    void test202402030736() {
        int int1 = 1;
        int int2 = 1;
        assertThat(int1 == int2).isTrue();

        int2 = 2;
        assertThat(int1 == int2).isFalse();
    }

    @Test
    @DisplayName("Integer Cache는 -128 ~ 127 범위 값을 재사용 가능하게 한다: 값이1인 경우")
    void test202402030728() {
        Integer integer1 = Integer.valueOf(127);
        Integer integer2 = Integer.valueOf(127);

        assertThat(integer1 == integer2).isTrue(); //같은 객체이다.
        assertThat(integer1.equals(integer2)).isTrue();

        integer2 = 2;

        assertThat(integer1 == integer2).isFalse();
        assertThat(integer1.equals(integer2)).isFalse();
    }

    @Test
    @DisplayName("-128 ~ 127 범위 밖의 값은 heap영역 새로운 주소에 새로운 객체를 생성한다: 값이128인 경우")
    void test202402030733() {
        Integer integer1 = Integer.valueOf(128);
        Integer integer2 = Integer.valueOf(128);

        assertThat(integer1 == integer2).isFalse(); //다른 객체이다.
        assertThat(integer1.equals(integer2)).isTrue();

        integer2 = 2;

        assertThat(integer1 == integer2).isFalse();
        assertThat(integer1.equals(integer2)).isFalse();
    }

    @Test
    @DisplayName("Boolean classsms TRUE, FALSE 상수를 가지고 있어서 캐시와 유사하게 같은 객체를 사용한다")
    void test202402030737() {
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(true);

        assertThat(bool1 == bool2).isTrue();

        bool1 = Boolean.TRUE;
        bool2 = Boolean.TRUE;

        assertThat(bool1 == bool2).isTrue();

        bool1 = true;
        bool2 = true;

        assertThat(bool1 == bool2).isTrue();
    }

    @Test
    @DisplayName("""
            큰 따옴표로 묶인 문자열로 String객체를 생성하면,
            그 객체는 String Constant Pool에 저장되어 재사용된다
            """)
    void test202402030743() {
        String str1 = "hello";
        String str2 = "hello";

        assertThat(str1 == str2).isTrue(); // String Constant Pool에 저장된 같은 객체

        str2 = new String("hello");

        assertThat(str1 == str2).isFalse(); // 다름

        str2 = new StringBuilder()
                .append("h")
                .append("e")
                .append("l")
                .append("l")
                .append("o").toString();

        assertThat(str1 == str2).isFalse(); // 다름
    }

    @Test
    @DisplayName("todo")
    void test202402030704() {

        Chair chair = Chair.builder()
                .color("red").build();

        Room room = Room.builder().chair(chair).build();

        House house = House.builder()
                .name("house1")
                .hasGarden(true)
                .address(128)
                .zipCode(128)
                .room(room).build();

        House clonedHouse = house.clone();

        assertThat(house == clonedHouse)
                .as("clone된 집은 서로 다른 객체여야 한다").isFalse();
        assertThat(house.name == clonedHouse.name).isTrue();
        assertThat(house.hasGarden == clonedHouse.hasGarden).isTrue();
        assertThat(house.address == clonedHouse.address).isTrue();
        assertThat(house.zipCode == clonedHouse.zipCode).isTrue();
        assertThat(house.room == clonedHouse.room)
                .as("clone된 room은 서로 다른 객체여야 한다").isFalse();

        assertThat(house.room == clonedHouse.room)
                .as("clone된 room은 서로 다른 객체여야 한다").isFalse();

        assertThat(house.room.chair == clonedHouse.room.chair)
                .as("clone된 room의 chair는 서로 다른 객체여야 한다").isFalse();

        // Q > house.room.char.color == clonedHouse.room.char.color ?????
        // 두 String 객체는 다른 객체일까?, 다른 객체여야 할까?
    }
}