package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class T12thProgram {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Java","8");
        List<String> list2= Arrays.asList("explained", "through", "programs");

        Stream<String> concatSteam = Stream.concat(list1.stream(),list2.stream());

        concatSteam.forEach(str->System.out.print(str+" "));


    }
}
