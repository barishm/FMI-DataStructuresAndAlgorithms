package easy;

public class p744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char a = nextGreatestLetter(letters, 'z');
        System.out.println(a);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        char current = '{';
        boolean found = false;
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] > target && letters[i] < current){
                current = letters[i];
                found = true;
            }
        }

        if(found){
            return current;
        } else {
            return letters[0];
        }
    }
}
