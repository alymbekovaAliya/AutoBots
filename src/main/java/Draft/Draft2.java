package Draft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Draft2 {
    public static void main(String[] args) {

//
//        List<Integer> numbers2 =  numbers.stream().filter(n -> n > 0 && n % 2 == 0).toList();
//        System.out.println(numbers2);

//        List<String> words = Arrays.asList("cat", null, "elephant", "dog", "rhinoceros");
//        List<String> words2 = words.stream().filter(w -> w != null && w.length() > 3).toList();
//        System.out.println(words2);


//        List<Person> people = Arrays.asList(
//                new Person("Alice", 25),
//                new Person("Bob", 17),
//                new Person("Anna", 20),
//                new Person("Charlie", 30),
//        );
//        List<Person> people2 = people.stream().filter(p -> p.getName().startsWith("A") && p.getAge() >= 18).toList();
//        System.out.println(people2);

//        List<String> strings = Arrays.asList("15", "abc", "5", "20", "xyz");
//        List<String> strings2 = strings.stream().filter(n -> {
//            try {
//                return Integer.parseInt(n) > 10;
//            } catch (Exception e) {
//                return false;
//            }
//        }).toList();
//        System.out.println(strings2);


//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        List<String> words2 = words.stream().map(String::toUpperCase).toList();
//        System.out.println(words2);

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20)
        );

        List<String> names = people.stream().map(Person::getName).toList();
        System.out.println(names);

        List<Integer> numbers = Arrays.asList(-2, 1, 0, 3, -4, 5);
        List<Integer> numbers2 = numbers.stream().filter(n -> n > 0).map(n -> n * n).toList();
        System.out.println(numbers2);

        List<String> strings = Arrays.asList("10", "abc", "20", "xyz", "30");
        List<Integer> strings2 = strings.stream().map( n -> {
            try {
              return Integer.parseInt(n) ;
            } catch (NumberFormatException e) {
               return 0;
            }

        }).toList();

        System.out.println(strings2);

        List<String> words = Arrays.asList("cat", "elephant", "dog", "rhinoceros");
        words.stream().filter(n -> n.length() > 3).forEach(System.out::println);


        List<Integer> numbers3 = Arrays.asList(-2, 1, 0, 3, -4, 5);
        List<Integer> numbers4 = new ArrayList<>();
        numbers3.stream().filter(n -> n > 0).forEach( n -> numbers4.add(n + 10));

        System.out.println(numbers4);

        List<Integer> numbers5 = Arrays.asList(-2, 1, 2, 3, -4);
        int n = numbers5.stream().filter(n1 -> n1 > 0).map(n1 -> n1 * n1).reduce(0, Integer::sum);

        System.out.println(n);

        List<String> words2 = Arrays.asList("cat", "elephant", "dog", "rhinoceros");
        String word = words2.stream().filter(w -> w.length() > 3).reduce("", (a,b) -> a.isEmpty() ? b : a + ", " + b);
        System.out.println(word);

        List<String> words3 = Arrays.asList("a", "cat", "dog", "elephant");

        String word2 = words3.stream().map(n2 -> n2.length() > 2 ? "word-" + n2 : "").reduce("", (a,b) -> a.isEmpty() ? b : a + ";" + b);
        System.out.println(word2);

        List<String> words4 = Arrays.asList("Apple", "banana", "Apricot", "cherry");
        String word3 = words4.stream().filter(n1 -> n1.contains("A")).map(String::toUpperCase).reduce("", (a , b) -> a.isEmpty() ? b : a + " " + b);
        System.out.println(word3);

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (" + age + ")";
//    }
