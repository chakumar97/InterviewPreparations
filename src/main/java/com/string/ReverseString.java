package com.string;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "chandan and suraj";
        System.out.println(reverse(str));

        //the idiomatic solution is
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

    }

    private static String reverse(String str) {
        return Stream.of(str).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
    }
}
