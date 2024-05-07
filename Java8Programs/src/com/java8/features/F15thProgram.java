package com.java8.features;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class F15thProgram {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Shubham");
        List<String> list2 = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(list2);


    }
}
