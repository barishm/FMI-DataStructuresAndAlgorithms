package medium;

import java.util.*;

public class p15_3Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum2(arr);
        System.out.println(lists);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> Parentlist = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        list.sort(Integer::compareTo);
                        String key = list.toString();

                        if (!set.contains(key)) {
                            set.add(key);
                            Parentlist.add(list);
                        }
                    }
                }
            }
        }
        return Parentlist;
    }
    public static List<List<Integer>> threeSum2(int[] nums){
        List<List<Integer>> parentList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -2; i++) {
            int start = i + 1;
            int end = nums.length -1;
            if(i == 0 || nums[i] != nums[i-1]){
                while (start < end) {
                    int cur = nums[i] + nums[start] + nums[end];
                    if(cur == 0) {
                        parentList.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        while (start < end && nums[start] == nums[start+1]) start++;
                        while (start < end && nums[end] == nums[end-1]) end --;
                        start++;
                        end--;
                    } else if (cur > 0) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return parentList;
    }
}
