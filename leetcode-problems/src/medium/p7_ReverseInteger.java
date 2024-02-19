package medium;

public class p7_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));

    }
    public static int reverse(int x) {
        boolean isPositive = true;
        StringBuilder sb;
        if(x < 0) isPositive = false;

        if(isPositive){
            sb = new StringBuilder(String.valueOf(x));
            sb.reverse();
            if(Long.parseLong(String.valueOf(sb)) > Integer.MAX_VALUE){
                return 0;
            }
            x = Integer.parseInt(String.valueOf(sb));
        } else {
            sb = new StringBuilder(String.valueOf(x));
            sb.deleteCharAt(0);
            sb.reverse();
            if(Long.parseLong(String.valueOf(sb)) > Integer.MAX_VALUE){
                return 0;
            }
            sb.insert(0,"-");
            x = Integer.parseInt(String.valueOf(sb));
        }


        return x;
    }
}
