package com.java8.features;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class S17thProgram {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA","BB","AA","CC");

        Map<String,Long> namesCount = list.stream().filter(x-> Collections.frequency(list,x)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(namesCount);

    }

}
