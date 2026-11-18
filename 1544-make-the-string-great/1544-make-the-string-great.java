class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        if (s==null || s.length()<=1) {
            return s;
        }

        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);

            if (!st.isEmpty()) {
                char top=st.peek();

                boolean sameLetter =
                    Character.toLowerCase(top) == Character.toLowerCase(ch);

                boolean differentCase =
                    (Character.isUpperCase(top) && Character.isLowerCase(ch)) ||
                    (Character.isLowerCase(top) && Character.isUpperCase(ch));

                if (sameLetter && differentCase) {
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        String res = "";
        for (char c : st) {
            res += c;
        }
        return res;
    }
}