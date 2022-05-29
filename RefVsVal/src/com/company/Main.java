package com.company;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = readInteger();
        int[] array = readElements(number);
        System.out.println("Minimum value of array is: " + findMin(array));

    }

    private static int readInteger(){
        int number;
        System.out.print("Enter the desired number of elements:\t");
        number = scanner.nextInt();
        return number;
    }

    private static int[] readElements(int count){
        int[] array = new int[count];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter " + (i+1) + ". number of the array:\t");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){

            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
