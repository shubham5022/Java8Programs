package com.java8.features;

import java.util.Arrays;

public class F14thProgram {
    public static void main(String[] args) {

        int arr[]={99,55,203,99,4,91};

        Arrays.parallelSort(arr);

        Arrays.stream(arr).forEach(n-> System.out.println(n+" "));



    }
}
