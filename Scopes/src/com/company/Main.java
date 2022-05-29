package com.company;

public class Main {

    public static void main(String[] args) {
        ScopeCheck scope = new ScopeCheck();

        scope.timesTwo();

        ScopeCheck.InnerClass innerTest = scope.new InnerClass();

        System.out.println("__________________________");

        innerTest.timesTwo();
    }
}
