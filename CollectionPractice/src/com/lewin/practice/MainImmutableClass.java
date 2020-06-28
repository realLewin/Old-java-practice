package com.lewin.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainImmutableClass {

    private static Map<Integer, Location> locations = new HashMap<>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

//        locations.put(0, new Location(0, "you out !"));
//        locations.put(1, new Location(1, "you now in the left"));
//        locations.put(2, new Location(2, "you now in the right"));
//        locations.put(3, new Location(3, "you now in the bottom"));
//        locations.put(4, new Location(4, "you now in the middle"));
//        locations.put(5, new Location(5, "you now in the top"));
//
//        locations.get(1).addExit("T", 5);
//
//        locations.get(2).addExit("M", 4);
//
//        locations.get(3).addExit("M", 4);
//        locations.get(3).addExit("L", 1);
//
//        locations.get(4).addExit("R", 2);
//        locations.get(4).addExit("L", 1);
//        locations.get(4).addExit("T", 5);
//        locations.get(4).addExit("B", 3);
//
//        locations.get(5).addExit("L", 1);
//        locations.get(5).addExit("M", 4);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());

            if (loc == 0) {
                break;
            }

            System.out.println("Available move is/are : ");
            for (String exit : locations.get(loc).getExits().keySet()) {
                System.out.print(exit + " , ");
            }

            System.out.println();
            String move = s.nextLine().toUpperCase();
            if (locations.get(loc).getExits().containsKey(move)) {
                loc = locations.get(loc).getExits().get(move);
            } else {
                System.out.println("you can't go there ...");
            }
        }


    }


    public static class Location {
        private final int locationID;
        private final String description;
        private final Map<String, Integer> exits;

        public Location(int locationID , String description , Map<String , Integer> exits) {
            this.locationID = locationID;
            this.description = description;
            this.exits = exits ;
            exits.put("Q", 0);
        }

        public int getLocationID() {
            return locationID;
        }

        public String getDescription() {
            return description;
        }

        public Map<String, Integer> getExits() {
            return new HashMap<>(exits);
        }

    }
}
