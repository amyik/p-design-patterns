package creational.builder.simple_builder_with_director;

public class HouseDirector {

    public static void constructApartment(HouseBuilder builder) {
        builder.roomCount(3).bathroomCount(2).hasGarden(false);
    }

    public static void constructCastle(HouseBuilder builder) {
        builder.roomCount(10).bathroomCount(5).hasGarden(true);
    }
}
