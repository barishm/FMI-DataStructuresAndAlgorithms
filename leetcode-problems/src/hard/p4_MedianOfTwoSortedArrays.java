package hard;

public class p4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,5,8,9};
        int[] nums2 = {3,4,5,6,7};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int nums1Size = nums1.length;
        int nums2Size = nums2.length;
        int[] arr = new int[nums1Size + nums2Size];
        int i = 0, j = 0 ,k = 0;
        while (i < nums1Size && j < nums2Size) {
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i< nums1Size) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2Size) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        if(arr.length % 2 == 0) {
            median = arr[(arr.length / 2) - 1] + arr[arr.length /2];
            return median/2;
        } else {
            return arr[arr.length/2];
        }
    }
}
