package livecoding.simple_builder_1;

import lombok.ToString;

@ToString
public class House {

    private int roomCount;
    private int bathroomCount;
    private boolean hasGarden;

    public House() {
    }

    public House(int roomCount, int bathroomCount, boolean hasGarden) {
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
        this.hasGarden = hasGarden;
    }

    public House(int roomCount, int bathroomCount) {
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
    }

    public House(int bathroomCount, boolean hasGarden) {
        this.bathroomCount = bathroomCount;
        this.hasGarden = hasGarden;
    }

    public House(int bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public void setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }
}
