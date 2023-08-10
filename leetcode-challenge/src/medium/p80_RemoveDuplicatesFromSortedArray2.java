package medium;

import java.util.Arrays;

public class p80_RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int i = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=2;i<nums.length;i++) {
            if (nums[i] != nums[j - 1]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
