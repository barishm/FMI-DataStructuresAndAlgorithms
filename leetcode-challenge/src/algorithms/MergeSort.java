package algorithms;

import java.util.Arrays;
import java.util.Random;



public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(0,100);
        }
        System.out.println(Arrays.toString(nums));
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums) {
        if(nums.length < 2) {
            return;
        }
        int midIndex = nums.length/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[nums.length-midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = nums[i];
        }
        for (int i = midIndex; i < nums.length; i++) {
            rightHalf[i-midIndex] = nums[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(nums,leftHalf,rightHalf);

    }
    private static void merge (int[] nums,int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0 ,k = 0;
        while (i < leftSize && j < rightSize) {
            if(leftHalf[i] <= rightHalf[j]){
                nums[k] = leftHalf[i];
                i++;
            }
            else {
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i< leftSize) {
            nums[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            nums[k] = rightHalf[j];
            j++;
            k++;
        }

    }
}