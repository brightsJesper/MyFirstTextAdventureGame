import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void game() {
        Scanner input = new Scanner(System.in);
        String command = input.next();

// Rooms Archive - To be moved somewhere
        Room room2=new Room (2,"Second Room","This is the starter description for the second room","A1");
        Room room1=new Room (1,"Starting Room","This is the starter description for the first room","A1");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

    }

}
