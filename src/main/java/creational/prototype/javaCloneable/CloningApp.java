package creational.prototype.javaCloneable;

import lombok.Builder;

public class CloningApp {

}


@Builder
class House implements Cloneable{
    String name;
    Boolean hasGarden;
    Integer address;
    int zipCode;

    Room room;

    @Override
    public House clone() {
        try {
            House clone = (House) super.clone();
            clone.room = this.room.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

@Builder
class Room implements Cloneable{
    Chair chair;

    @Override
    public Room clone() {
        try {
            Room clone = (Room) super.clone();
            clone.chair = this.chair.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

@Builder
class Chair implements Cloneable{
    String color;

    @Override
    public Chair clone() {
        try {
            Chair clone = (Chair) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
