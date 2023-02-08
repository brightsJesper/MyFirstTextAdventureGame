package src;

import java.util.ArrayList;
import java.util.List;

public class Vault {
    public static Room here;
    public static List<Room> rooms = new ArrayList<>();
    public static void roomArchive(){
        Room room2=new Room ("Second Room","This is the starter description for the second room");
        Room room1=new Room ("Starting Room","This is the starter description for the first room");
        rooms.add(room2);
        rooms.add(room1);
    }

    public static Room getHere() {
        return here;
    }

    public static void setHere(Room here) {
        Vault.here = here;
    }

    public static List<Room> getRooms() {
        return rooms;
    }

    public static void setRooms(List<Room> rooms) {
        Vault.rooms = rooms;
    }
}
