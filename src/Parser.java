package src;

import java.util.List;
import java.util.Scanner;

public class Parser {
        static void stringDivider(String input) {
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            List<String> resultList = List.of(input.split(" "));
        }
    }
