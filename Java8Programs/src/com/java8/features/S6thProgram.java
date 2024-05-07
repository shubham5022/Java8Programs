package com.java8.features;

import java.util.Arrays;
import java.util.List;

public class S6thProgram {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,56,7,7,8);

        System.out.println(list.stream().max(Integer::compare).get());

    }
}
