package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F5thProgram {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        long count = list.stream().count();
        System.out.println(count);

    }
}
