package src;

import java.util.ArrayList;
import java.util.List;

public class Vault {
    public static ArrayList<Room> roomArchive() {
        Room room2 = new Room("Second Room", "This is the starter description for the second room");
        Room room1 = new Room("Starting Room", "This is the starter description for the first room");
        Room rStart = new Room("Starting Room", "This is the starter description for the first room");

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(room2);
        rooms.add(room1);
        rooms.add(rStart);
        return rooms;
    }

}
