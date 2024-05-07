package com.java8.features;

import java.util.Arrays;
import java.util.List;

public class F4thProgram {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream().findFirst().ifPresent(System.out::println);

    }
}
