class Solution {
    public String removeDuplicates(String s) {
        List<Character> st=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty()){
                char top=st.get(st.size()-1);
                if(c==top){
                    st.remove(st.size()-1);
                    continue;
                }
            }
            st.add(c);
        }
        String ans="";
        for(int i=0;i<st.size();i++){
            ans+=st.get(i);
        }
        return ans;
    }
}