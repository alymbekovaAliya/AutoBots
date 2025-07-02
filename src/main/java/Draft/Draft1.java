package Draft;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Draft1 {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(5);

        System.out.println(square(list));
    }

    public List<Integer> square56(List<Integer> nums) {
      nums.replaceAll(n -> (n * n) + 10);
      return nums.stream().filter(n -> n % 10 != 5 && n % 10 != 6).collect(Collectors.toList());
    }


    public List<Integer> two2(List<Integer> nums) {
      nums.replaceAll(n -> n * 2);
      return nums.stream().filter(n -> n % 10 != 2).collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {
        strings.removeIf(n -> n.endsWith("y") || n.contains("yy"));
      strings.replaceAll(n -> n + "y");
      return strings;
    }

    public List<String> noLong(List<String> strings) {
     strings.removeIf(n -> n.length() == 2 || n.length() == 3 );
     return strings;
    }

    public List<String> noZ(List<String> strings) {
      strings.removeIf(n -> n.contains("z"));
      return strings;
    }

    public List<Integer> noTeen(List<Integer> nums) {
      nums.removeIf(n -> n >= 13 && n <= 19);
      return nums;
    }

    public List<Integer> no9(List<Integer> nums) {
      nums.removeIf(n -> n % 10 == 9);
      return nums;
    }

    public List<Integer> noNeg(List<Integer> nums) {
      return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());


        //nums.removeIf(n -> n < 0);
    }

    public List<String> noX(List<String> strings) {
     return strings.stream().map(n -> n.replace("x", "")).collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public List<Integer> math1(List<Integer> nums) {
//    nums.replaceAll(n -> (n + 1) * 10);
//    return nums;
        return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
//     strings.replaceAll(n -> "y" + n + "y");
//     return strings;
        return strings.stream().map(n -> "y" + n + "y").collect(Collectors.toList());
    }

    public List<String> copies3(List<String> strings) {
//    strings.replaceAll(n -> n.repeat(3));
//    return strings;
        return strings.stream().map(n -> n.repeat(3)).collect(Collectors.toList());
    }


    public List<String> addStar(List<String> strings) {
//     strings.replaceAll(n -> n + "*");
//     return strings;
        return strings.stream().map(n -> n + "*").collect(Collectors.toList());
    }


    public static List<Integer> square(List<Integer> nums) {
//      nums.replaceAll( n -> n * n);
//      return  nums;
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static List<Integer> doubling(List<Integer> nums) {
       return nums.stream().map(n ->  n * 2).collect(Collectors.toList());
       // nums.replaceAll(n -> n * 2);
    }

}
