package src;

import java.util.ArrayList;
import java.util.List;

public class Vault {
    public static List<Room> roomArchive() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("room1"));
       // rooms.get(rooms.indexOf(new Room("room1"))).setDesc("This is the first room");
        /*
        rooms.get(rooms.indexOf(new Room("room1"))).setName("First Room");
        rooms.add(new Room("room2"));
        rooms.get(rooms.indexOf(new Room("room2"))).setDesc("This is the second room");
        rooms.get(rooms.indexOf(new Room("room2"))).setName("Second Room");
        rooms.add(new Room("start"));
        rooms.get(rooms.indexOf(new Room("start"))).setDesc("starting room");
        rooms.get(rooms.indexOf(new Room("start"))).setName("Start");
       */
        return rooms;
    }

}
