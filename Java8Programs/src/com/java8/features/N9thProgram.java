package com.java8.features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class N9thProgram {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);



    }
}
