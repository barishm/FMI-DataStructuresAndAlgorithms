package medium;

public class p74_Search2dMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        int target = 0;
        boolean b = search2dMatrix(matrix,target);
        System.out.println(b);
    }

    private static boolean search2dMatrix(int[][] matrix, int target) {
        int rowLow = 0;
        int rolHigh = matrix.length-1;
        while (rowLow <= rolHigh){
            int midPosition = (rowLow + rolHigh) / 2;
            int midNumber = matrix[midPosition][0];
            if(target == midNumber){
                return true;
            }
            if(target < midNumber){
                rolHigh = midPosition-1;
            }else {
                rowLow = midPosition + 1;
            }
        }
        if(rolHigh < 0) {
            return false;
        }
        int colLow = 0;
        int colHigh = matrix[rolHigh].length-1;
        while (colLow <= colHigh) {
            int midPosition = (colLow + colHigh) / 2;
            int midNumber = matrix[rolHigh][midPosition];
            if(target == midNumber){
                return true;
            }
            if(target < midNumber){
                colHigh = midPosition-1;
            }else {
                colLow = midPosition + 1;
            }
        }
        return false;
    }
}
