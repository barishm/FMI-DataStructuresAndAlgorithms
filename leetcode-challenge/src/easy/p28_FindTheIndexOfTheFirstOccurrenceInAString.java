package easy;

public class p28_FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int i = strStr(haystack, needle);
        System.out.println(i);

    }
    public static int strStr(String haystack, String needle) {
        int startIndex = -1;
        int needleindex = 0;
        int count = needle.length();
        boolean needleBegin = false;
        for (int i = 0; i < haystack.length(); i++) {

            if(haystack.charAt(i) == needle.charAt(needleindex)){
                if(!needleBegin){
                    startIndex = i;
                    needleBegin = true;
                }
                needleindex++;
                if(needleindex == count) {
                    return startIndex;
                }

            }else {
                if(needleBegin){
                    i = startIndex;
                }
                needleBegin = false;
                needleindex = 0;
            }
        }
        return -1;
    }
}
