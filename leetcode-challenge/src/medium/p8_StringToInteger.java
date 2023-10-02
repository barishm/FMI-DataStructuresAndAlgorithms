package medium;

public class p8_StringToInteger {
    public static void main(String[] args) {
        int  number = Convert("4193 with words");
        System.out.println(number);
    }

    private static int Convert(String s) {
        long num = 0;
        if(s.isEmpty()) return 0;

        int i = 0, sign = 1;
        char current = s.charAt(0);

        while (current == ' '){
            i++;
            if(i == s.length()) return 0;
            current = s.charAt(i);
        }

        if(current == '-'){
            sign = -1;
            i++;
        } else if(current == '+'){
            sign = 1;
            i++;
        }

        for (; i < s.length(); i++) {
            current = s.charAt(i);

            if(current < '0' || current > '9') break;
            else {
                num *= 10;
                num += current - '0';

                if(sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
                else if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            }

        }
        num *= sign;
        return (int) num;
    }
}