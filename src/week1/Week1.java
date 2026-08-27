package week1;

import java.util.Arrays;

public class Week1 {
    static void main() {


        Week1 week1 = new Week1();
        week1.table();
        week1.rwoNumSum(5);
        week1.reversInt(321);
        week1.palindromic("asa");
        week1.even();




        int age = 20;
        System.out.println( age > 18 ? "Взрослый " : "дитя");



        int[] mas1 = {1, 3, 4, 5, 7, 1, 4, 5, 8, 9, 3, 12};
        int max = 0;

        for (int r : mas1) {
            if (max < r) {
                max = r;
            }
        }
        System.out.println("Самое большое число в массиве: " + max);


        int[] masSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : masSum) {
            sum += x;
        }
        System.out.println("Сумма всех чисел в массиве " + sum);


    }

    int[] mainMas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void even() {

        for (int item : mainMas) {
            if (item % 2 != 0) {
                System.out.println(item + " в квадрате = " + item * item);
            }
        }
    }

    public void table() {
        for (var i = 1; i <= 9; i++) {
            for (var s = 1; s <= 9; s++) {

                System.out.print(s + " * " + i + " =" + i * s);
                System.out.print("\t");
            }
            System.out.println();


        }

    }


    public void rwoNumSum(int s) {

        int[] nums = {1, 3, 4, 1, 5, 7, 8, 0, 9, 7};
        if (s >= 0) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == s) {
                        System.out.println("Число = " + s);
                        System.out.println(" " + nums[i] + " + " + nums[j] + " = " + s);
                        return;
                    }
                }
            }
            System.out.println("В массиве нету подходящих 2 чисел");


        } else {
            System.out.println(" Число s меньше чем 0  > " + s);
        }

    }

    public void reversInt(int number) {
        int res = 0;

        while (number != 0) {
            res = res * 10 + (number % 10);
            number /= 10;
        }
        System.out.println(res);
    }

    public void palindromic(String text) {
        String u = "";

        for (int i = 0; i < text.length(); i++) {
            u += text.charAt(text.length() - 1 - i);

        }
        System.out.println(text.equals(u));
    }
}