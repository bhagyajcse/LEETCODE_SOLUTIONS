class Solution {
    public String makeGood(String s) {
        List<Character> st = new ArrayList<>();

        if (s==null || s.length()<=1) {
            return s;
        }

        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);

            if (!st.isEmpty()) {
                char top=st.get(st.size()-1);

                boolean sameLetter =
                    Character.toLowerCase(top) == Character.toLowerCase(ch);

                boolean differentCase =
                    (Character.isUpperCase(top) && Character.isLowerCase(ch)) ||
                    (Character.isLowerCase(top) && Character.isUpperCase(ch));

                if (sameLetter && differentCase) {
                    st.remove(st.size()-1);
                    continue;
                }
            }
            st.add(ch);
        }
        String res = "";
        for (char c : st) {
            res += c;
        }
        return res;
    }
}