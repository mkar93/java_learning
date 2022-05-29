package com.example.myseries;

public class Series {

    public static int nSum(int n){

        int sum = 0;
        int count = 0;

        for(int i=0;i<n*10;i+=count){
            sum+=i;
            count++;
        }

        return sum;
    }

    public static int fibonacci(int n){

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.println(n1 + "\n" + n2);

        for(int i=2;i<n;++i){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static int factorial(int n){

        int product = 1;

        for(int i=1;i<n;i++){
            product = product * i;
        }
        return product;
    }
}
