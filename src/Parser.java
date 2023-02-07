package src;

import java.util.List;
import java.util.Scanner;

public class Parser {
    static List<String> strDivider(List<String> list) {
        return strCounter(list);
    }

    //method figuring how many arguments that were used and redirects the string accordingly
    static String strCounter(List<String> list) {
        if (list.size() == 2) {

        }
        return strVerbAdjective(list);
    }

    // switch method dealing with simple verb/adjective commands.
    static void strVerbAdjective(List<String> list) {
        switch (list.get(0)) {
            case "go":
                switch (list.get(1)) {
                    case "north":
                        System.out.println("You walk north");


                }
        }
    }
}
