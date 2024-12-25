package medium;

import java.util.Arrays;

public class p75_SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortColors(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int index = 0;

        while (index <= endIndex && startIndex < endIndex){
            if(arr[index] == 0) {
                arr[index] = arr[startIndex];
                arr[startIndex] = 0;
                startIndex++;
                index++;
            } else if (arr[index] == 2) {
                arr[index] = arr[endIndex];
                arr[endIndex] = 2;
                endIndex--;
            } else {
                index++;
            }
        }

    }
}
