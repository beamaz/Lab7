package com.company;

import java.util.Arrays;
import java.util.List;

public class Lab7_Lambda {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(46, 83, -36, 64, 2, -67);

        System.out.println("Lambda");
        list.forEach(x->System.out.println(x));

        System.out.println("Operator ::");
        list.forEach(System.out::println);
    }

}
