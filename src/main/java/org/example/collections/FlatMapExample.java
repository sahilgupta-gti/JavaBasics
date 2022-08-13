package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1, 2, 3));
        lists.add(Arrays.asList(4, 5, 6));
        lists.add(Arrays.asList(7, 8, 9));

        System.out.println("FlatMapExample: " + lists);
        List<Integer> collect = lists.stream().flatMap(item -> item.stream().map(x -> x * 2)).collect(Collectors.toList());
        System.out.println("After flattening: " + collect);


    }
}
