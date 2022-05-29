package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int value;
        System.out.print("How many numbers do you wish to process: ");
        value = scanner.nextInt();

        int[] myIntegers = getIntegers(value);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];

        for(int i=0;i< values.length;i++){
            System.out.print("Enter " + (i+1) + ". number of the array\t");
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] sortIntegers(int number[]) {

        int temp;
        int[] sortedArray = Arrays.copyOf(number, number.length);

        for(int i=0;i<sortedArray.length-1;i++) {
            for(int j=0;j<sortedArray.length-1-i;j++){
                if(sortedArray[j] < sortedArray[j+1]){
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }

        return sortedArray;
    }

    public static void printArray(int number[]) {

        for(int i=0;i<number.length;i++){
            System.out.println("Element " + i + " contents " + number[i]);
        }
    }

}