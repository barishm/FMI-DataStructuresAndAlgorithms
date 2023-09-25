package easy;


import java.util.Arrays;

public class p66_PlusOne {
    public static void main(String[] args) {
        int[] arr = {8,9,9,9};
        int[] ints = plusOne(arr);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
            }

            if(i == 0) {
                int[] arr = new int[digits.length+1];
                arr[0] = 1;
                return arr;
            }
        }
        return digits;
    }
}