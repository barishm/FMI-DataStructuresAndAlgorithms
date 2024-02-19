package easy;

public class p2119_aNumberAfterADoubleReversal {
    public static void main(String[] args) {
        boolean sameAfterReversals = isSameAfterReversals(0);
        System.out.println(sameAfterReversals);
    }
    public static boolean isSameAfterReversals(int num) {
        String number = String.valueOf(num);
        if(number.length() == 1){
            return true;
        }
        if(number.charAt(number.length()-1) != '0'){
            return true;
        } else {
            return false;
        }

    }
}
