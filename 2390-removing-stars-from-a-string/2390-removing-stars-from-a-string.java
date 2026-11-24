class Solution {
    public String removeStars(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!res.isEmpty()){
                if(c=='*'){
                    res.deleteCharAt(res.length()-1);
                    continue;
                }
            }
            res.append(c);
        }
        return res.toString();
    }

}