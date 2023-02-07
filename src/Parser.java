package src;

import java.util.List;
import java.util.Scanner;

public class Parser {
    static List<String> strDivider(String input) {
        input = input.toLowerCase();
        return List.of(input.split(" "));
    }
    static String strCounter(List<String> list) {
        if (list.size()==2){
            strVerbAdjective(list);
        }
        return "strCounter done";
    }
    static void strVerbAdjective(List<String> list){
        switch (list.get(0)){
            case "go":

        }
    }
    }
