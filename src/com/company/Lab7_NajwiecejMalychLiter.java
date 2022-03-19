package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Lab7_NajwiecejMalychLiter {

    public static long countUpperCase(String str){
        return str.chars().filter((s)->Character.isUpperCase(s)).count();
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("PaWel", "KrzyszToF", "Bartosz");
        Object[] arr = strings.stream().sorted((s1, s2) ->  (int) countUpperCase(s2) - (int) countUpperCase(s1)).toArray();
        System.out.println(arr[0]);
    }
}
