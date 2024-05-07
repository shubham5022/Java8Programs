package com.java8.features;

import java.util.Arrays;
import java.util.List;
public class S2ndProgram {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,12,13,14,15,6,7,8,9);
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);


    }
}
