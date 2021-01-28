public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String str){

        int lenght = str.length();
        if (lenght <= 1){
            return lenght;
        }
        int head = 0;
        int tail = 1;
        int max = 0;
        char[] chars = str.toCharArray();

        for (int i = 1; i < lenght; i++) {
            char currChar = chars[i];
            for (int j = head; j < tail; j++) {
                if (currChar == chars[j]){
                    head = j + 1;
                }
            }
            tail++;
            max = Math.max(max, tail - head);
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int res = lengthOfLongestSubstring(str);
        System.out.println(res);
    }
}
