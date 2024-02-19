package easy;

import java.util.Arrays;

public class p27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int i = removeElement(nums, val);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));

    }
    public static int removeElement(int[] nums, int val) {
        int count = nums.length;
        int k = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                count--;
                nums[i] = Integer.MAX_VALUE;
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
                i--;
            }
        }
        return count;
    }
}
