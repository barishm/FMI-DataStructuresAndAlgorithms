package medium;

import java.util.Arrays;

public class p189_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 1;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));

    }
    public static void rotate(int[] nums, int k) {
        int[] rotated = new int[nums.length];
        k %= nums.length;
        if(k == 0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            rotated[i] = nums[nums.length - k + i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            rotated[k + i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotated[i];
        }
    }
}
