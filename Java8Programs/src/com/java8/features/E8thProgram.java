package com.java8.features;

import java.util.Arrays;
import java.util.List;

public class E8thProgram {
    public static void main(String[] args) {
        List<Integer> myList= Arrays.asList(10,15,8,49);
        myList.stream().sorted().forEach(System.out::println);
    }
}
