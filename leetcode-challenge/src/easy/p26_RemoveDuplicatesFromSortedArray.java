package easy;

import java.util.Arrays;

public class p26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(i);

    }
    public static int removeDuplicates(int[] nums) {
        int k = nums.length;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(j != i && nums[j] < nums[i]){
                nums[j+1] = nums[i];
                j++;

            }else {
                k--;
            }
        }
        return k;
    }
}
