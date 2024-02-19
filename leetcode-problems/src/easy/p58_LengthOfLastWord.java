package easy;

public class p58_LengthOfLastWord {
    public static void main(String[] args) {
        String word = "a";
        int i = lengthOfLastWord(word);
        System.out.println(i);
    }
    public static int lengthOfLastWord(String s) {
        int letterCount = 0;
        boolean wordBegin = false;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) > 64 && s.charAt(i) < 91) {
                letterCount++;
                wordBegin = true;
            } else if (s.charAt(i) > 96 && s.charAt(i) < 123) {
                letterCount++;
                wordBegin = true;
            }
            if(wordBegin && s.charAt(i) == 32){
                break;
            }
        }
        return letterCount;
    }
}
