package com.company;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.NoSuchElementException;

public class Lab7_SummaryStatistics {

    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics statistics = primes.stream()
                .mapToInt(x -> x)
                .summaryStatistics();

        int min = statistics.getMin();
        int max = statistics.getMax();
        int sum = (int) statistics.getSum();
        int average = (int) statistics.getAverage();

        System.out.println("min " + min + " max " + max + " sum " + sum + " average " + average);
    }

}
