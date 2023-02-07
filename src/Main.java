package src;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(strDivider(input).toString());



        }

    static List<String> strDivider(String input) {
        List<String> resultList = List.of(input.split(" "));
        return resultList;
        }
    }
