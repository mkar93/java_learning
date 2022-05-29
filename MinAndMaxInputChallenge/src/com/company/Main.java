package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum=0;
        int maxNum=0;

        for(;;){
            System.out.print("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                if(number<minNum)
                    minNum=number;
                else maxNum=number;
            }
            else break;

            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Minimum number is: " + minNum + ", and maximum number is: " + maxNum);
    }
}
