package medium;

public class p45_JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1};
        int result = jumpGame2(nums);
        System.out.println(result);

    }

    public static int jumpGame2 (int[] nums) {
        int minSteps = 0;
        int nextIndex = 0;
        int searching;
        int avaibleJumps;

        for (int i = 0; i < nums.length-1;) {
            searching = nums[i];
            avaibleJumps = nums[i];
            for (int j = i+1; j < i+avaibleJumps+1; j++) {
                if(j >= nums.length-1) {
                    nextIndex = j;
                    break;
                }
                if(nums[j] >= searching) {
                    searching = nums[j];
                    nextIndex = j;
                } else {
                    searching--;
                }
            }
            i = nextIndex;
            minSteps++;
        }
        return minSteps;
    }
}
