package algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(0,100);
        }
        System.out.println(Arrays.toString(nums));
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void quickSort(int[] nums){
        quickSort(nums,0,nums.length-1);
    }
    private static void quickSort(int[] nums, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }
        int pivotIndex = new Random().nextInt(highIndex-lowIndex) + lowIndex;
        int pivot = nums[highIndex];
        swap(nums,pivotIndex,highIndex);
        int leftP = partition(nums, lowIndex, highIndex, pivot);
        quickSort(nums,lowIndex,leftP-1);
        quickSort(nums,leftP+1,highIndex);
    }

    private static int partition(int[] nums, int lowIndex, int highIndex, int pivot) {
        int leftP = lowIndex;
        int rightP = highIndex;
        while (leftP < rightP){
            while (nums[leftP] <= pivot && leftP < rightP){
                leftP++;
            }
            while (nums[rightP] >= pivot && leftP < rightP){
                rightP--;
            }
            swap(nums,leftP,rightP);
        }
        swap(nums,leftP, highIndex);
        return leftP;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
