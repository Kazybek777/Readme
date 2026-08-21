package week1;

import java.util.Arrays;

public class Week1 {
    int[] mainMas = {1,2,3,4,5,6,7,8,9,10};

    public void Even(){
        // четные и нечетные

        for (int item : mainMas){
            if (item % 2 !=  0){
                System.out.println(item + " в квадрате = " + item * item);
            }
        }
    }

    public void Table() {
        for (var i = 1; i <= 9; i++) {
            for (var s = 1; s <= 9; s++) {

                System.out.print(s + " * " + i + " =" + i * s);
                System.out.print("\t");
            }
            System.out.println();


        }
        String arr = "Понравилось. Лежит теперь в любимом. Но дифирамбы петь не буду. Ведь то что я увидел, развидеть я уже не смогу";
        System.out.println(arr.length());

    }


    public void TwoNumSum(int s) {

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

    public void ReversInt(int number){
        int res = 0;

        while (number != 0) {
            res = res * 10 + (number % 10);
            number /= 10;
        }
        System.out.println(res);
    }

    public void Palindromic(String text){
        String s = "";

        for (int i = 0; i < text.length(); i++) {
            s += text.charAt(text.length() -1 -i);

        }
        System.out.println(text.equals(s)? true : false);

    }

  /*

    int[] nums = new int[5];
    for( int i = 0; i < nums.length; i++){
        nums[i] = i+i;
    }

    System.out.println(Arrays.toString(nums));
    var i = (nums.length % 2 == 0) ? true : false;
    System.out.println(i);

    System.out.println();



    int age = 20;
    System.out.println(age < 18 ? true : false);





     to sum
    int[] mass = {1,5,2,1,5,4,8};
    int e = 0;
    int s = 10;
    for (int i = 0; i < mass.length; i++) {
        for (int j = i+1; j < mass.length; j++) {
            if (mass[i]  + mass[j] == s){
                System.out.println(mass[i] + " + " + mass[j] + " = "+ s );
                e++;
            }
        }
    }
    System.out.println(e);




    //MAX
    int [] mas1 = {1,3,4,5,7,1,4,5,8,9,3,12};
    int max = 0;

    for (int s : mas1){
        if (max < s){
            max = s;
        }
    }
    System.out.println(max);

    //all sum in array
    int[] masSum = { 1,2,3,4,5,6,7,8,9,10};
    int sum = 0;
    for (int x : masSum){
        sum +=x;
    }
    System.out.println(sum);
*/

}