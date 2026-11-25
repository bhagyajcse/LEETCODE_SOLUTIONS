class Solution {
    public int evalRPN(String[] tokens) {
        List<Integer> st=new ArrayList<>();
        
        for(int i=0;i<tokens.length;i++){
            
            if(tokens[i].matches(("-?\\d+"))){
                int num=Integer.parseInt(tokens[i]);
                st.add(num);
            }
            if(tokens[i].equals("+")){
                int a=st.remove(st.size()-1);
                int b=st.remove(st.size()-1);
                int sum=a+b;
                st.add(sum);
            }
            if(tokens[i].equals("*")){
                int a=st.remove(st.size()-1);
                int b=st.remove(st.size()-1);
                int prod=a*b;
                st.add(prod);
            }
            if(tokens[i].equals("/")){
                int a=st.remove(st.size()-1);
                int b=st.remove(st.size()-1);
                int div=b/a;
                st.add(div);
            }
            if(tokens[i].equals("-")){
                int a=st.remove(st.size()-1);
                int b=st.remove(st.size()-1);
                int sub=b-a;
                st.add(sub);
            }
        }
        return st.remove(st.size()-1);
    }
}