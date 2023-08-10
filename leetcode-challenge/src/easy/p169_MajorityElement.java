package easy;

import java.util.Arrays;

public class p169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1};
        int i = majorityElement2(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(i);

    }
    public static int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int count = 0;

        for (int i = 0; i <nums.length; i++) {
            count++;
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && j != i) {
                    count++;
                }
            }
            if(count > n) {
                return nums[i];
            }
            count = 0;
        }

        return 0;
    }
    public static int majorityElement2(int[] nums) {
        int candidate = nums[0];
        int majority = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != candidate){
                majority--;
                if(majority <= 0) {
                    candidate = nums[i];
                    majority = 1;
                }
            }else {
                majority++;
            }

        }

        return candidate;
    }
}
