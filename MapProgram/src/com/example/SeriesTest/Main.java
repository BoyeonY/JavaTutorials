package com.example.SeriesTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations= new HashMap<>();
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,"you are sitting in front of fa computer learning java"));
        locations.put(1, new Location(1,"you are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2,"you are at the top of a hill"));
        locations.put(3, new Location(3,"you are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4,"you are in a valley beside a stream"));
        locations.put(5, new Location(5,"you are in the forest"));


        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);


        locations.get(2).addExit("N",5);

        locations.get(3).addExit("W",1);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);


        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);

        Map<String, String> vocabrary = new HashMap<>();
        vocabrary.put("QUIT","Q");
        vocabrary.put("WEST","W");
        vocabrary.put("EAST","E");
        vocabrary.put("NORTH","N");
        vocabrary.put("SOUTH","S");

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExists();
            System.out.println("Available exits are");
            for(String exit: vocabrary.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();



            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocabrary.containsKey(word)){
                        direction = vocabrary.get(word);
                        break;
                    }
                }

            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("you cannot go in that direction");
            }

        }
//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for (String i : road){
//            System.out.println(i);
//        }
//        System.out.println("========================");
//
//        String[] building = " you are inside a building, a well house for small spring".split(", ");
//        for (String i: building){
//            System.out.println(i);
//        }

    }
}
