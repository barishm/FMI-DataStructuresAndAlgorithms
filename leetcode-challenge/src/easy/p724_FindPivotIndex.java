package easy;

public class p724_FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        int i = FindPivot(arr);
        System.out.println(i);
    }

    private static int FindPivot(int[] arr) {
        int sum = 0;
        int leftSum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(leftSum == sum){
                return i;
            }else {
                if(i < arr.length-1){
                    sum -= arr[i+1];
                }
                leftSum += arr[i];
            }
        }
        return -1;
    }
}
