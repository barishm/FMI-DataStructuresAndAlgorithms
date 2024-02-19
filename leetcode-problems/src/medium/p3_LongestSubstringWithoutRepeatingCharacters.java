package medium;

import java.util.HashMap;
import java.util.Map;


public class p3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= j){
                j = map.get(s.charAt(i)) + 1;
            }
            count = Math.max(count,i - j + 1);
            map.put(s.charAt(i),i);

        }
        return count;
    }
}
