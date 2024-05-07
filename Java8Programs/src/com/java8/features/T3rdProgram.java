package com.java8.features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T3rdProgram {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,4,6,6,8,8);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);
    }
}
