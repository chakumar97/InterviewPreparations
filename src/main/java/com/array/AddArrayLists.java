package com.array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddArrayLists {

    public static void main(String[] args) {
        List<String> list1 = List.of("Chandan", "Jishu", "Hema");
        List<String> list2 = List.of("Shubham", "Nandu", "Sahil");
        List<String> list3 = List.of("Tepu", "Bikrant", "Dada");

        List<String> res = Stream.of(list1, list2, list3).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(res);

        List<String> res2 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(res2);

        List<String> res3 =  Stream.of(list1.stream(), list2.stream(), list3.stream())
                .flatMap(s -> s)
                .collect(Collectors.toList());

        System.out.println(res3);
    }
}
