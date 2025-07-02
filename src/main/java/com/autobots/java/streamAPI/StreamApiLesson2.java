package com.autobots.java.streamAPI;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiLesson2 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", 28, 3000, "IT"),
                new Employee(2, "Bob", 35, 4000, "HR"),
                new Employee(3, "Charlie", 40, 5000, "Finance"),
                new Employee(4, "David", 25, 3500, "IT"),
                new Employee(5, "Eva", 30, 4200, "Marketing"),
                new Employee(6, "Frank", 45, 6000, "Finance"),
                new Employee(7, "Grace", 32, 4100, "HR"),
                new Employee(8, "Henry", 29, 3900, "IT"),
                new Employee(9, "Isabel", 38, 4500, "Marketing"),
                new Employee(10, "Jack", 27, 3600, "IT")
        );

//        Map<String, Double> allSum = new HashMap<>();
//        Map<String, Integer> count = new HashMap<>();
//
//        for(Employee employee: employees) {
//            allSum.put(employee.getDepartament(),allSum.getOrDefault(employee.getDepartament(),0.0) + employee.getSalary());
//            count.put(employee.getDepartament(), count.getOrDefault(employee.getDepartament(),0) + 1);
//        }
//
//
//        for(String as: allSum.keySet()) {
//            double midlle = allSum.get(as) / count.get(as);
//            System.out.printf("%s -> $%.2f%n", as, midlle);
//        }


        Map<String,Double> averageSalaryByDepWithStream = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartament,
                        Collectors.averagingDouble(Employee::getSalary)));

        averageSalaryByDepWithStream.forEach((dep, salary) ->
                System.out.println(dep + " $" + salary));

        //Методические ссылки (Employee::getDepartament и Employee::getSalary)
        //не выполняются сразу при объявлении потока.
        //
        // Они вызываются только тогда, когда поток начинает выполняться — то есть при вызове терминального метода .collect().


    }
}
