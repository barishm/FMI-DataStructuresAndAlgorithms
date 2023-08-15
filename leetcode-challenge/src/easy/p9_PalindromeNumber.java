package easy;

public class p9_PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);

    }
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int j = 0;
        for (int i = String.valueOf(x).length()-1; i >= 0; i--) {
            if(String.valueOf(x).charAt(i) != str.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}
