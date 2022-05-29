package com.company;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
        /*StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);*/


        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        //one.instanceNumber = 4;
        System.out.println(Math.PI);


        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();
    }

    public static int multiply(int number){
        return number*multiplier;
    }
}
