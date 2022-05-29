package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*int[] myVariable = new int[10];
        myVariable[5] = 50;
        double[] myDoubleArray = new double[10];
        System.out.println(myVariable[5]);

        for(int i=0;i<myVariable.length;i++){
            myVariable[i]+=100;
            System.out.println(myVariable[i]);
        }*/

        int[] myIntegers = getIntegers(5);
        for(int i=0;i< myIntegers.length;i++){
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}
