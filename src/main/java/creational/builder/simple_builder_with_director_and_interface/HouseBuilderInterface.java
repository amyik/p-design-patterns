package creational.builder.simple_builder_with_director_and_interface;

public interface HouseBuilderInterface {
    HouseBuilderInterface roomCount(int num);

    HouseBuilderInterface bathroomCount(int num);

    HouseBuilderInterface hasGarden(boolean has);
}
