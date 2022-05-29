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

        //int[] sortedArray = Arrays.copyOf(number, number.length);

        for(int i=0;i<number.length-1;i++) {
            for(int j=0;j<number.length-1-i;j++){
                if(number[j] < number[j+1]){
                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }

        return number;
    }

    /*public static int[] sortIntegers(int [] array){
        int[] sortedArray = new int[array.length];
        for(int i=0;i< array.length;i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }*/

    public static void printArray(int number[]) {

        for(int i=0;i<number.length;i++){
            System.out.println("Element " + (i+1) + ". of sorted array is: \t" + number[i]);
        }
    }

}
