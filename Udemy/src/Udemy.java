package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true) {
            if (hourOfDay < 0 || hourOfDay > 23)
                return false;
            else if(hourOfDay < 8 || hourOfDay > 22)
                return true;
        }
        return false;
    }
}
