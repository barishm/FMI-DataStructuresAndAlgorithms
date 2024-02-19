package medium;

public class p5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = longestPalindrome("gllg");
        System.out.println(s);

    }
    public static String longestPalindrome2(String s) {




        return "";
    }
    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        if(s.length() == 1){
            return s;
        }

        for (int i = 0; i < s.length()-1; i++) {
            for (int j = s.length()-1; j >= i; j--) {
                sb.append(s, i, j+1);
                sb.reverse();
                if(s.substring(i,j+1).contentEquals(sb) && result.length() < sb.length()){
                    result = s.substring(i,j+1);
                    sb.setLength(0);
                    continue;
                }

                if(result.length() > s.length()-1 - i){
                    return result;
                }
                sb.setLength(0);
            }
        }

        return result;
    }
}
