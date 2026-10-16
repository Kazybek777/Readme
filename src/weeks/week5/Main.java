package weeks.week5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    void main(){
        int nums[] = {1,5,4,7,9,6,3,1,4};
        int num = 7;
        Sum(nums,num);
    }


    static public int[] Sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] d = { i, j};
                    System.out.println(nums[i] + " + " + nums[j] + " это у нас = " + target);
                }
            }
        }
        return nums;
     }
}