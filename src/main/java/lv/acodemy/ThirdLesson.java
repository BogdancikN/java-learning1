package lv.acodemy;

import java.util.Arrays;

public class ThirdLesson {
    public static void main(String[] args) {

        //Conditional aperators in Java

        // if (is, has -> isRaining, isRandomNumber, hasEvenValue)
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if (temperature > 29) {
            System.out.println("It is too hot!");
        }

        // AND (&&)
        if (4 > 2 && 10 < 11) {
            System.out.println("Both are equals!");
        }

        // OR (||)
        if (4 > 2 || 10 > 11) {
            System.out.println("Execute this code!");
        }

        //if-else...
        boolean isWeekDay = true;

        if(isWeekDay) {
            System.out.println("Working today ...");
        } else {
            System.out.println("Will stay at home!");
        }

        int number = 10;
        //%
        // + - / * (

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // if age => 18 -> Access granted
        // In oll other cases -> Access denied

        int age = 16;
        if (age >= 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // if-else-if-else

        int hour = 7;
        if(hour == 5) {
            System.out.println("will go for run!");
        }else if (hour == 7) {
            System.out.println("will have the breakfasts!");
        } else if (hour == 9) {
            System.out.println("will start work!");
        } else  {
            System.out.println("free time!");
        }

        // score <= 90 - Perfect
        // <= 70 - Good
        // <= OK
        // else => not Ok

        int score = 85;
        if (score >= 90) {
            System.out.println("Perfect");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

        // age -> 0 - 6 = Baby
        // 7-17 -> Shkilla
        // 18-65 -> Adult
        // 66+ pens;

        int age1 = 25;
        if (age1 >= 0 && age <= 6) {
            System.out.println("Baby");
        } else if (age1 >= 7 && age <= 17) {
            System.out.println("Shkilla");
        } else if (age1 >= 18 && age <= 65) {
            System.out.println("Adult");
        } else if (age1 >= 66) {
            System.out.println("Pensioner");
        } else {
            System.out.println("Invalid age");
        }

        int[] numbers = {-2, -18, 5, 6, -100, 3,0,20};
        int sum = 0;

        // Count sum only for numbers that are positive

        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
            }}
        System.out.println("Sum of positive numbers: " + sum);

        int sumOfNumbers = Arrays.stream(numbers)
                .filter (n -> n > 0)
                .sum();
        System.out.println(sumOfNumbers);

        // 1 till 20,
        // print numbers that can be divided by 3 and 5;
        // print divided by 3
        // print divided by 5
        // else -> just print number;

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " делится на 3 и 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " делится на 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " делится на 5");
            } else {
                System.out.println(i);
            }
        }





    }
}

