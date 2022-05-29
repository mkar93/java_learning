package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
            if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
                return -1;
            double wallArea = width*height;
            double bucketCanCover = areaPerBucket*extraBuckets;
            return wallArea-bucketCanCover;
        }
    }
}
