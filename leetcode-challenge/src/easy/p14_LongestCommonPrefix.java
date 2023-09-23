package easy;

import java.sql.Array;

public class p14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {""};
        String s = longestCommonPrefix2(arr);
        System.out.println(s);

    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int shortestWord = Integer.MAX_VALUE;
        int shortestWordIndex = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortestWord) {
                shortestWord = strs[i].length();
                shortestWordIndex = i;
            }
        }

        for (int i = 0; i < shortestWord; i++) {
            boolean isCommon = true;
            for (int j = 0; j < strs.length; j++) {
                if(j != shortestWordIndex && strs[shortestWordIndex].charAt(i) != strs[j].charAt(i)){
                    isCommon = false;
                }
            }
            if(isCommon) {
                result += strs[shortestWordIndex].charAt(i);
            } else {
                break;
            }
        }
        return result;
    }
    public static String longestCommonPrefix2(String[] strs) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (true) {
            boolean isCommon = true;

            for (int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i){
                    isCommon = false;
                    break;
                }
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    isCommon = false;
                    break;
                }
            }
            if(!isCommon) {
                break;
            } else if (!strs[0].isEmpty()){
                result.append(strs[0].charAt(i));
            }

            i++;
        }
        return result.toString();
    }
}
