package medium;

public class p11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,0,0,2,2};
        int i = maxArea(arr);
        System.out.println(i);
    }
    public static int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int tank = 0;
        if(height[leftIndex] >= height[rightIndex]){
            tank = height[rightIndex] * (rightIndex - leftIndex);
        } else {
            tank = height[leftIndex] * (rightIndex - leftIndex);
        }
        while (rightIndex - leftIndex > 1) {
            if(height[leftIndex] >= height[rightIndex]){
                rightIndex--;
            } else {
                leftIndex++;
            }

            if(height[leftIndex] >= height[rightIndex]){
                if(height[rightIndex] * (rightIndex - leftIndex) > tank){
                    tank = height[rightIndex] * (rightIndex - leftIndex);
                }
            } else {
                if(height[leftIndex] * (rightIndex - leftIndex) > tank){
                    tank = height[leftIndex] * (rightIndex - leftIndex);
                }
            }
        }
        return tank;
    }
}
