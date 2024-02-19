package easy;

public class p13_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));

    }
    public static int romanToInt(String s) {
        int result = 0;

        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M' -> result += 1000;
                case 'D' -> result += 500;
                case 'C' -> {
                    if(i == s.length()-1){
                        result += 100;
                    }
                    else if (s.charAt(j) == 'D') {
                        result += 400;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'M') {
                        result += 900;
                        i++;
                        j++;
                    } else {
                        result += 100;
                    }
                }
                case 'L' -> result += 50;
                case 'X' -> {
                    if(i == s.length() - 1){
                        result += 10;
                    }
                    else if (s.charAt(j) == 'L') {
                        result += 40;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'C') {
                        result += 90;
                        i++;
                        j++;
                    } else {
                        result += 10;
                    }
                }
                case 'V' -> result += 5;
                case 'I' -> {
                    if(i == s.length()-1){
                        result++;
                    }
                    else if (s.charAt(j) == 'V') {
                        result += 4;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'X') {
                        result += 9;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'I') {
                        result += 2;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'I' && s.charAt(j + 1) == 'I') {
                        result += 3;
                        i += 2;
                        j += 2;
                    }
                }
            }
            j++;
        }
        return result;
    }
}
