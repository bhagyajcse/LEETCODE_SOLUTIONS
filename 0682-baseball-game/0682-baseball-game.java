class Solution {
    public int calPoints(String[] operations) {
       List<Integer> st=new ArrayList<>();
       for(int i=0;i<operations.length;i++){
        String ch=operations[i];
        if(ch.equals("+")){
            int a=st.remove(st.size()-1);
            int b=st.get(st.size()-1);
            st.add(a);
            st.add(a+b);
        }else if(ch.equals("D")){
            int c=2*st.get(st.size()-1);
            st.add(c);
        }else if(ch.equals("C")){
            st.remove(st.size()-1);
        }else{
            st.add(Integer.parseInt(ch));
        }
       } 
       int sum=0;
       while(!st.isEmpty()){
        sum=sum+st.remove(st.size()-1);
       }
       return sum;
    }
}