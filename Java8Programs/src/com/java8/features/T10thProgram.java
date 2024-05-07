package com.java8.features;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T10thProgram {

    public static boolean containsDuplicate(int []num){

        List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());

        Set <Integer> set = new HashSet<>(list);

        if(set.size()==list.size()){
            return false;
        } else return true;





    }

    public static void main(String[] args) {

        int [] num ={1,2,3,1};

        boolean t = T10thProgram.containsDuplicate(num);

        System.out.println(t);



    }
}
