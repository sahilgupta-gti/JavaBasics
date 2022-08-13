package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonUsingStreams {

    public static void main(String[] args) {

        List<String> a1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        List<String> a2 = new ArrayList<>(Arrays.asList("b", "c", "d", "e", "f", "g"));
        System.out.println("FindCommonUsingStreams: " + a1.stream().filter(a2::contains).collect(Collectors.toList()));
    }


}
