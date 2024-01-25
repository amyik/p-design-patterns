package creational.builder.simple_builder_with_director_and_interface;

public class HouseDirector {

    public static void constructApartment(HouseBuilderInterface builder) {
        builder.roomCount(3).bathroomCount(2).hasGarden(false);
    }

    public static void constructCastle(HouseBuilderInterface builder) {
        builder.roomCount(10).bathroomCount(5).hasGarden(true);
    }
}
