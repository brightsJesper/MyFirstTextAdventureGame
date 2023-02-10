package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parser {
    static void in(String input) {
        input = input.toLowerCase();
        List<String> list = List.of(input.split(" "));
        if (list.size() == 2) {
            switch (list.get(0)) {
                case "go":
                    switch (list.get(1)) {
                        case "north":
                            System.out.println("You walk north");
                    }
            }

        }
    }
}
