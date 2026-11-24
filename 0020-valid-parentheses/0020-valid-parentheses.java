class Solution {
    public boolean isValid(String s) {
        List<Character> st=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.add(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.remove(st.size()-1);
                if((top=='(' && ch!=')') || (top=='[' && ch!=']') || (top=='{' && ch!='}')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}