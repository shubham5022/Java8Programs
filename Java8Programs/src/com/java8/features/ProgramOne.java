package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramOne {

    public static void main(String[]args){

        List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9,0);
        List<Integer> evenNumbers=
                list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

}
