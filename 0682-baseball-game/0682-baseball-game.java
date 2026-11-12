class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<operations.length;i++){
        String ch=operations[i];
        if(ch.equals("+")){
            int a=st.pop();
            int b=st.peek();
            st.push(a);
            st.push(a+b);
        }else if(ch.equals("D")){
            int c=2*st.peek();
            st.push(c);
        }else if(ch.equals("C")){
            st.pop();
        }else{
            st.push(Integer.parseInt(ch));
        }
       } 
       int sum=0;
       while(!st.isEmpty()){
        sum=sum+st.pop();
       }
       return sum;
    }
}