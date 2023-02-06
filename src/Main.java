package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    String input = scanner.next();

        System.out.println(stringDivider(input));

      }
      static String stringDivider(String input){
        //List<String> resultList = List.of(input.trim().split(" ")); Thought maybe ArrayList was the problem
          String[] resultList = input.split("\\s+");


        for (String s : resultList){
            System.out.println(s);
        }

        return "done";

      }
}