package easy;

public class p35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,10};
        int i = searchInsert(arr, 9);
        System.out.println(i);

    }
    public static int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
            return nums.length;
        } else if (target < nums[0]) {
            return 0;
        }
        int low = 0;
        int high = nums.length-1;
        int midPosition = 0;
        while (low <= high){
            midPosition = (low + high) / 2;
            int midNumber = nums[midPosition];
            if(target == midNumber){
                return midPosition;
            }
            if(target < midNumber){
                high = midPosition-1;
            }else {
                low = midPosition + 1;
            }
        }
        if(nums[midPosition] < target){
            midPosition++;
        }
        return midPosition;
    }
}
