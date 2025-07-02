package Draft;

public class Draft3 {
    public static void main(String[] args) {
        System.out.println(String.valueOf(8 + 9).length());
    }

    public String mixString(String a, String b) {
        String result = "";


        if (!a.isEmpty() && !b.isEmpty()) {
            for (int i = 0; i < a.length() + b.length(); i++) {
                result += a.charAt(i) + "" + b.charAt(i);
            }
        } else if (a.isEmpty() && !b.isEmpty()) {
            result = b;
        } else if (b.isEmpty() && !a.isEmpty()) {
            result = a;
        }

        return result;
    }


    public boolean xyBalance(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.substring(i + 1).contains("y") && !str.substring(i + 2).contains("x"))
                return true;
        }

        if (!str.contains("x") || str.equals("y") || str.isEmpty()) {
            return true;
        }

        return false;
    }

    public boolean bobThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }

        }

        return false;
    }


    //Возвращает true, если данная строка содержит появление "xyz", где xyz не предшествует непосредственно точка (.).
    // Таким образом, "xxyz" засчитывается, а "x.xyz" - нет.

    public boolean xyzThere(String str) {
        String xyz = "xyz";

        if (str.length() < 3) return false;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals(xyz) && i == 0) {
                return true;
            } else if (str.substring(i, i + 3).equals(xyz) && str.charAt(i - 1) != 46) {
                return true;
            }
        }


        return false;
    }

    //Если даны две строки, верните true, если одна из них находится в самом конце другой строки,
    // игнорируя различия между верхним и нижним регистром (другими словами, вычисления не должны быть "чувствительны к регистру").
    // Примечание: str.toLowerCase() возвращает строчную версию строки.

    public boolean endOther(String a, String b) {

        if (a.length() >= b.length()) {
            return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
        } else if (a.length() < b.length()) {
            return b.substring(b.length() - a.length()).equalsIgnoreCase(a);
        }

        return false;

    }


    //Возвращает количество раз, когда строка «code» встречается где-либо в данной строке,
    //за исключением того, что мы будем принимать любую букву за „d“, так что „cope“ и «cooe» считаются.

    public int countCode(String str) {
        String co = "co";
        Character e = 'e';
        int count = 0;

        if (str.length() < 4) return 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals(co) && str.charAt(i + 3) == e) {
                count++;
            }
        }

        return count;
    }


    public int sumLimit(int a, int b) {

        if (String.valueOf(a).length() < String.valueOf(a + b).length()) {
            return a;
        }

        return a + b;
    }


    public boolean shareDigit(int a, int b) {

        if ((a < 10 || a > 100) && (b < 10 || b > 100)) return false;

        int aLeft = a / 10;
        int aRight = a % 10;

        int bLeft = b / 10;
        int bRight = b % 10;

        return aLeft == bLeft || aLeft == bRight || aRight == bRight || aRight == bLeft;
    }

    //У вас есть синий лотерейный билет, на котором записаны инты a, b и c.
    // Получилось три пары, которые мы назовем ab, bc и ac.
    // Рассмотрим сумму чисел в каждой паре. Если сумма любой пары равна ровно 10, то результат будет равен 10.
    // В противном случае, если сумма ab ровно на 10 больше сумм bc или ac, результат будет равен 5.
    // В противном случае результат будет равен 0.

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab - 10 == bc || ab - 10 == ac) return 5;


        return 0;
    }


    //У вас есть зеленый лотерейный билет, на котором указаны числа a, b и c.
    // Если все числа отличаются друг от друга, то результат равен 0.
    // Если все числа одинаковые, то результат равен 20. Если два числа одинаковые, то результат равен 10.
    public int greenTicket(int a, int b, int c) {

        if (a == b && b == c) return 20;
        if (a == b || a == c || c == b) return 10;

        return 0;
    }


    //У вас есть красный лотерейный билет, на котором изображены инты a, b и c,
    // каждый из которых равен 0, 1 или 2. Если все они имеют значение 2, результат равен 10.
    // В противном случае, если все они одинаковы, результат равен 5.
    // В противном случае, если b и c отличаются от a, результат равен 1. В противном случае результат равен 0.

    public int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        }

        return 0;
    }


    public int makeChocolate(int small, int big, int goal) {
        int result = goal - (big * 5);
        int result2 = goal - 5;

        if (result >= 0 && result <= small) {
            return result;
        } else if (result2 > 0 && result2 <= small) {
            return result2;
        } else if (goal == 5) {
            return 0;
        } else if (goal == small) {
            return small;
        }

        return -1;
    }

    public boolean evenlySpaced(int a, int b, int c) {


        return Math.abs(a - b) == Math.abs(c - b) && a != c || Math.abs(b - a) == Math.abs(c - a) && b != c || Math.abs(a - c) == Math.abs(c - b) && a != b;
    }


    public static int blackjack(int a, int b) {
        int result = 0;

        if (a > 21 && b > 21) return result;

        if (a > 0 || b > 0) {
            int c = 21 - a;
            int d = 21 - b;

            if (a <= 21 && b <= 21) {
                if (c > d) {
                    result = b;
                } else {
                    result = a;
                }
            } else {

                if (a >= 21 && b <= 21) {
                    result = b;
                } else {
                    result = a;
                }
            }
        }

        return result;
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else {
            return false;
        }
    }


    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        if (num % 10 < 5) {
            return num - (num % 10);
        } else {
            return num + (10 - (num % 10));
        }

    }

    public int noTeenSum(int a, int b, int c) {
        if (a >= 13 && a <= 14 || a >= 17 && a <= 19) {
            a = 0;
        }
        if (b >= 13 && b <= 14 || b >= 17 && b <= 19) {
            b = 0;
        }
        if (c >= 13 && c <= 14 || c >= 17 && c <= 19) {
            c = 0;
        }
        return a + b + c;
    }
}
