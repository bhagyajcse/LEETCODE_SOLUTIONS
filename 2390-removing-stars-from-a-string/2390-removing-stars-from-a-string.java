class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty()){
                if(c=='*'){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        String ans="";
        for(int i=0;i<st.size();i++){
            ans+=st.get(i);
        }
        return ans;
    }
}