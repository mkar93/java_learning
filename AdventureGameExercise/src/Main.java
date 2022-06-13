/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Main main = new Main();

        main.command();
    }

    public Main() {


        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
    }

    //private Map<String, String> vocabulary = new HashMap<>();


    public void command() {

        Scanner scanner = new Scanner(System.in);

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }

            //vocabulary.put("N", "NORTH");
            //vocabulary.put("S", "SOUTH");
            //vocabulary.put("W", "WEST");
            //vocabulary.put("E", "EAST");

            String[] input = scanner.nextLine().toUpperCase().split(" ");
            String direction = null;

            for(String i: input){
                if(i.equals("EAST") || i.equals("WEST") || i.equals("SOUTH") || i.equals("NORTH") || i.equals("QUIT")){
                    direction = String.valueOf(i.charAt(0));
                }
                else if(input.length == 1){
                    direction = i;
                }
            }


            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            else{
                System.out.println("You cannot go in that direction");
            }
        }
    }
}