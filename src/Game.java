package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    static Room here;

    public static Room getHere() {
        return here;
    }

    public static void setHere(Room here) {
        Game.here = here;
    }

    static ArrayList<Room> rList = Vault.roomArchive();
    public static void init() {
        here = rList.get(rList.indexOf("rStart"));
        System.out.println( here.getName()+"\n"+here.getDesc()+"\nGame initialized and set to starting room");
    }
    static void play(){

    }
}

