import java.util.*;

class Solution {
    public boolean checkString(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'b') {
                st.push(ch);
            }
            else {
                if(st.contains('b')) {
                    return false;
                }
                st.push(ch);
            }
        }

        return true;
    }
}