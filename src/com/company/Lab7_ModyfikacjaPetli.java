package com.company;

import java.util.Arrays;
import java.util.List;

public class Lab7_ModyfikacjaPetli {

        public static void main(String[] args) {
            List<Integer> list3 = Arrays.asList(11, -2, 42, -7, 56);
            int x, sum = 0;
            sum = list3
                    .stream()
                    .reduce(0, (subtotal, n) -> subtotal + (2 * n * n - 5 * n + 6));

        }
}
