package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Game {

    public static Room here;
    public static List<Room> rooms = new ArrayList<>();


    public static void game() {

// Rooms Archive - To be moved somewhere
        Room room2=new Room ("Second Room","This is the starter description for the second room");
        Room room1=new Room ("Starting Room","This is the starter description for the first room");
        rooms.add(room1);
        rooms.add(room2);
// Current Room
 here = room1;

// Testing Stuff


    }
}

