package com.java8.features;

import java.util.Arrays;
import java.util.List;

public class T13thProgram {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,5,6,7,8,1);

        list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);

    }
}
