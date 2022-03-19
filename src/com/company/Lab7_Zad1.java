package com.company;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Lab7_Zad1 {

    public static void main(String[] args) {

        Predicate<Integer> isGreaterThan10Predicate = x -> x > 10;
       Optional<Integer> res = IntStream.range(0, 21).boxed()
                .filter(x -> x % 2 == 0 && x > 10)
                .map(x -> x * x)
                .limit(5)
                .reduce(Integer::sum);
        res.ifPresent(System.out::println);
    }



}
