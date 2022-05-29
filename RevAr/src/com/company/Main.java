package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};

        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    /*private static void reverse(int[] array){
        int[] revArray = new int[array.length];
        int j = array.length;

        for(int i=0;i < array.length;i++){
            revArray[j-1] = array[i];
            j = j - 1;
        }
        System.out.println("Reversed array = " + Arrays.toString(revArray));
    }*/

    private static void reverse(int[] array){

        for(int i=0;i < array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}
