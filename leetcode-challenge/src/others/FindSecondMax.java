package others;

public class FindSecondMax {
    public static void main(String[] args) {
        int[] nums = {12,11,4,8,10,3,7,9};
        findSecondMax(nums);
    }

    private static void findSecondMax(int[] nums) {
        int max = nums[0];
        int second = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                second = max;
                max = nums[i];
            } else if (second < nums[i]) {
                second = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(second);
    }
}
