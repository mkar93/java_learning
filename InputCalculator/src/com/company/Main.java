package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        public static void inputThenPrintSumAndAverage(){
            Scanner scanner=new Scanner(System.in);

            int sum=0;
            double avg=0.0;
            int counter=0;

            for(;;){
                boolean hasNextInt = scanner.hasNextInt();
                if(hasNextInt){
                    int number = scanner.nextInt();
                    sum+=number;
                    counter++;
                }
                else{
                    avg=Math.round((double)sum/(double)counter);
                    System.out.println("SUM = " + sum + " AVG = " + (int)avg);
                    break;
                }
                scanner.nextLine();
            }
            scanner.close();
        }
    }
}
