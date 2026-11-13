class Solution {
    public boolean isAnagram(String s, String t) {
        Stack<Character> st=new Stack<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.push(ch);
        }
        for(int i=0;i<t.length();i++){
            boolean found=false;
            for(int j=0;j<st.size();j++){
                if(t.charAt(i)==st.get(j)){
                    st.remove(j);
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return st.isEmpty();
    }
}