package lv.acodemy;

public class ThirdLessonPart2 {
    public static void main(String[] args) {

        int summa = add(10, 30);
        System.out.println(summa);

        System.out.println(add(20, 10));

        greet("Nadezda");

        int addResult  = add(30,10,5);
        System.out.println(addResult);

    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }
    // Method overLoading

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // max0fTwo, accepts: int a, int b; return the biggest number;

    public static int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

        // maxOfThree int a, int b, int c, returns the biggest number

        public static int maxOfThree(int a, int b, int c) {
            return Math.max(Math.max(a,b),c);
        }


    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }
}
