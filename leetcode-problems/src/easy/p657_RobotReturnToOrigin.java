package easy;

public class p657_RobotReturnToOrigin {
    public static void main(String[] args) {
        boolean b = judgeCircle("LL");
        System.out.println(b);

    }
    public static boolean judgeCircle(String moves) {
        boolean result = false;
        int[] coordinates = {0,0};

        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U'){
                coordinates[1] -= 1;
            } else if (moves.charAt(i) == 'D') {
                coordinates[1] += 1;
            } else if (moves.charAt(i) == 'R') {
                coordinates[0] += 1;
            } else if (moves.charAt(i) == 'L') {
                coordinates[0] -= 1;
            }
        }
        if(coordinates[0] == 0 && coordinates[1] == 0){
            result = true;
        }
        return result;
    }
}
