package com.autobots.java.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiLesson {
    public static void main(String[] args) {
//        List<String> names = List.of("Anna", "Bob", "Alex", "Bella", "Andre");
//
//        List<String> namesWithA = new ArrayList<>();
//        for(String name: names) {
//            if(name.startsWith("A")) {
//                namesWithA.add(name.toUpperCase());
//            }
//        }
//        Collections.sort(namesWithA);
//
//        System.out.println(namesWithA);
//
//        List<String> result = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(result);
//
//        List<Integer> numbers = List.of(1, 2,3 ,4, 5, 6);
//
//        int r1 = 0;
//
//        for(int num: numbers) {
//            r1+= num;
//        }
//
//        System.out.println(r1);
//
//        List<Employee> employees = List.of(
//                new Employee(1, "Alice", 28, 3000, "IT"),
//                new Employee(2, "Bob", 35, 4000, "HR"),
//                new Employee(3, "Charlie", 40, 5000, "Finance"),
//                new Employee(4, "David", 25, 3500, "IT"),
//                new Employee(5, "Eva", 30, 4200, "Marketing"),
//                new Employee(6, "Frank", 45, 6000, "Finance"),
//                new Employee(7, "Grace", 32, 4100, "HR"),
//                new Employee(8, "Henry", 29, 3900, "IT"),
//                new Employee(9, "Isabel", 38, 4500, "Marketing"),
//                new Employee(10, "Jack", 27, 3600, "IT")
//        );
//
//        int totalSum = numbers.stream()
//                .mapToInt(num -> num)
//                .sum();
//        System.out.println(totalSum);
//
//        int totalElements = (int)numbers.stream().count();
//        System.out.println(totalElements);
//
//        numbers.stream()
//                .min(Integer::compareTo)
//                .ifPresent(System.out::println);//Оператор ::
//
//        List<String> list = List.of("one", "two", "three", "Hello", "four", "five");
//
//        list.stream()
//                .filter(n -> n.length() > 3)
//                .findFirst()
//                .ifPresent(System.out::println);
//
//        List<Employee> it = employees.stream().filter(s -> s.getDepartament().equals("IT")).toList();
//        System.out.println(it);
//
//
//        for(Employee em: employees) {
//            if(em.getDepartament().equals("IT")) {
//                System.out.println(em);
//            }
//        }
//
//
//
//
//        Map<String, List<Employee>> employeesByDepatment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartament));
//         employeesByDepatment.forEach((department, list) -> {
//             System.out.println("Отдел " + department);
//             list.forEach(System.out::println);
//         });
//
//
//        Map<String, List<Employee>> employeesByDepatment2 = new HashMap<>();
//
//        for(Employee employee: employees) {
//            employeesByDepatment2.putIfAbsent(employee.getDepartament(), new ArrayList<>());
//            employeesByDepatment2.get(employee.getDepartament()).add(employee);
//        }
//
//        for(Map.Entry<String,List<Employee>> entry: employeesByDepatment2.entrySet()) {
//            System.out.println(entry.getKey() + "\n" + entry.getValue());
//
//        }
//
//
//        System.out.println(employeesByDepatment2);
//
//    }
    }
}
