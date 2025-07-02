package com.autobots.java.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiLesson3 {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );

        List<String> nestedList2 = nestedList.stream().flatMap(List::stream).toList();
//        System.out.println(nestedList2);

        List<String> nonStream = new ArrayList<>();

        for(List<String> list: nestedList) {
            nonStream.addAll(list);
        }

//        System.out.println(nonStream);

    }
}
//прочитать про map , класс object