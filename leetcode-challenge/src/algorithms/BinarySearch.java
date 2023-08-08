package algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        SelectionSort selectionSort = new SelectionSort();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }
        System.out.println(Arrays.toString(arr));
        SelectionSort.selectionSort(arr);
        int i = binarySearch(arr, 10);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int numberToFind) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int midPosition = (low + high) / 2;
            int midNumber = arr[midPosition];
            if(numberToFind == midNumber){
                return midPosition;
            }
            if(numberToFind < midNumber){
                high = midPosition-1;
            }else {
                low = midPosition + 1;
            }
        }
        return -1;
    }
}
