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

    public static void init() {
        List<Room> rList = Vault.roomArchive();
        System.out.println(rList.get(0).getrCode());
        System.out.println(rList.indexOf(new Room("room1")));

    }

    static void play() {

    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return true;
    }
}

