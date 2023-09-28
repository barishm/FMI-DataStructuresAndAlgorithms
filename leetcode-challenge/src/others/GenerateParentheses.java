package others;

import java.util.Random;

public class GenerateParentheses {
    public static void main(String[] args) {
        String pattern = GeneratePattern(8);
        System.out.println(pattern);
    }

    private static String GeneratePattern(int length) {
        StringBuilder result = new StringBuilder();
        int expectingOpen = 1;
        for (int i = 0; i < length/2; i++) {
            if(expectingOpen>0) {
                result.append("(");
                expectingOpen--;
            }else {
                Random random = new Random();
                boolean b = random.nextBoolean();
                if(!b){
                    result.append("(");
                    expectingOpen--;
                }else {
                    expectingOpen++;
                    result.append(")");
                }
            }
        }
        for (int i = length/2-1; i >= 0; i--) {
            if(result.charAt(i) == ')'){
                result.append('(');
            } else {
                result.append(')');
            }
        }

        return result.toString();
    }
}
