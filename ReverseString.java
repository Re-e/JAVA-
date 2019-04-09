package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString a = new ReverseString();
       char[] b = {'a','b','c','d','e','f','g'};
       a.reverseString(b);
        System.out.println(b);
    }

    public void reverseString(char[] s){
        helper(0,s.length-1,s);
    }

    private void helper(int start, int end, char [] s) {
        if (start >= end) {
            return;
        }
        // swap between the first and the last elements.
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;

        helper(start + 1, end - 1, s);
    }
}
