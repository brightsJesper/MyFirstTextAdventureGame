package org.example;

public class Main {

    static Room here;

    public static void main(String[] args) {

        for (int i = 0; i < Test.PubList().size(); i++) {
            System.out.println(Test.PubList().get(i).getName());
            System.out.println(Test.PubList().get(i).getDesc());
        }
        }
        /*
        here = Test.PubList().get(0);
        System.out.println(here.getDesc());

         */

    }