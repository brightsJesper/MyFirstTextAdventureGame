package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Game {
    public static void game() {

// Rooms Archive - To be moved somewhere
        Room room2=new Room ("Second Room","This is the starter description for the second room");
        Room room1=new Room ("Starting Room","This is the starter description for the first room");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

// Current Room
Room current=room1;

// Testing Stuff
        System.out.println(Objects.toString(current.getDesc()));
        String command = "north";
        System.out.println("Command to go north");
        current = room2;
        System.out.println(Objects.toString(current.getDesc()));



// Controls
        /*
        Scanner input = new Scanner(System.in);
        String command = "north";

      //  String command = input.next();
// if for later
        if (Objects.equals(command, "north")){

        }
     */

    }
}

