package com.autobots.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {

    public static void main(String[] args) {
        MathOperations addition = (a,b) -> a + b; //анонимные фукции
        MathOperations multi = (a,b) -> a * b; // как понять что это лямбда, есть стрелки

        System.out.println("5 + 3 = " + addition.operations(5,3));
        System.out.println("5 * 3 = " + multi.operations(5,3));

        //принимает объект возращает булеан
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("Java"));

        Function<Integer, String> toStringFun = x -> "Число + " + x;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print = s -> System.out.println("writting: " + s);
        print.accept("aliaaaaa");
    }
}
