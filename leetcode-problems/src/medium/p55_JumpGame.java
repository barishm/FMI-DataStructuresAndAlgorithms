package medium;

public class p55_JumpGame {
    public static void main(String[] args) {
        int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
        boolean b = canJump(nums);
        System.out.println(b);
    }
    public static boolean canJump(int[] nums) {
        if(nums.length == 1) {
            return true;
        }

        int i = 0;
        while (i < nums.length){
            int searching = 2;
            i += nums[i];
            if(i >= nums.length-1){
                return true;
            }
            if(nums[i] == 0) {
                if(i == 0) {
                    return false;
                }
                i--;
                while (nums[i] < searching){
                    if(i == 0) {
                        return false;
                    }
                    i--;
                    searching++;
                }
            }
        }
        return true;
    }
}
