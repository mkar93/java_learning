package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<String>();

        addNewSong(playlist,"Linkin Park - Session");
        addNewSong(playlist,"Linkin Park - Numb");

        playing(playlist);


    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - replay current song\n" +
                "4 - remove current song\n" +
                "5 - add new song\n" +
                "6 - show playlist\n" +
                "7 - print menu options\n");
    }

    private static boolean addNewSong(LinkedList<String> playlist, String newSongName){
        ListIterator<String> albumListIterator = playlist.listIterator();

        while(albumListIterator.hasNext()){
            int comparison = albumListIterator.next().compareTo(newSongName);
            if(comparison == 0){
                System.out.println(newSongName + " is already included in the playlist.");
                return false;
            }
            else if(comparison > 0){
                albumListIterator.previous();
                albumListIterator.add(newSongName);
                return true;
            }
            else{

            }
        }
        albumListIterator.add(newSongName);
        return true;
    }

    private static boolean addNewSong(LinkedList<String> playlist){
        ListIterator<String> albumListIterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        String addRequest = scanner.nextLine();


        while(albumListIterator.hasNext()){
            int comparison = albumListIterator.next().compareTo(addRequest);
            if(comparison == 0){
                System.out.println(addRequest + " is already included in the playlist.");
                return false;
            }
            else if(comparison > 0){
                albumListIterator.previous();
                albumListIterator.add(addRequest);
                return true;
            }
            else{

            }
        }
        albumListIterator.add(addRequest);
        return true;
    }

    /*private static boolean removeSong(LinkedList<String> playlist, String songName){
        ListIterator<String> albumListIterator = playlist.listIterator();

        while(albumListIterator.hasNext()){
            int comparison = albumListIterator.next().compareTo(songName);
            if(comparison == 0){
                System.out.println(songName + " removed from the playlist.");
                albumListIterator.remove();
                return true;
            }
            else if(comparison > 0){
                return false;
            }
            else{

            }
        }
        return false;
    }*/

    private static void showList(LinkedList<String> playlist){
        Iterator<String> i = playlist.iterator();
        int counter=1;
        System.out.println("Current playlist\n");
        while(i.hasNext()){
            System.out.println(counter + ". " + i.next());
            counter++;
        }
        System.out.println("__________________________________");
    }

    private static void playing(LinkedList<String> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = playlist.listIterator();

        if(playlist.getFirst().isEmpty()){
            System.out.println("No songs in current playlist");
        }
        else printMenu();

        while(!quit){
            int action = scanner.nextInt();
            switch(action){
                case 0:
                    System.out.println("Stopped playing.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now listening to " + listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now listening to " + listIterator.previous());
                    }
                    else{
                        System.out.println("Reached the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now listening to " + listIterator.previous());
                    }
                    else System.out.println("Reached the start of the playlist");
                    break;
                case 4:
                    if(listIterator.hasPrevious() || listIterator.hasNext()){
                        System.out.println(listIterator.next() + " removed from the playlist.");
                        listIterator.remove();
                        printMenu();
                    }
                    else{
                        System.out.println("Current playlist has no remaining songs\n");
                        printMenu();
                    }
                    break;
                case 5:
                    String newSong;
                    Scanner scanner2 = new Scanner(System.in);
                    newSong = scanner2.nextLine();
                    playlist.addLast(newSong);
                    goingForward = false;
                    printMenu();
                    scanner.nextLine();
                    break;
                case 6:
                    showList(playlist);
                    break;
                case 7:
                    printMenu();
                    break;
            }
        }

    }
}
