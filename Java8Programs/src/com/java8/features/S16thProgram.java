package com.java8.features;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class S16thProgram {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("AA","BB","AA", "CC");
        Map<String,Long> namesCount = name
                .stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(namesCount);


    }
}
