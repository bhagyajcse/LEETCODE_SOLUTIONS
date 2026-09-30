class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        Set<Character> set=new HashSet<>();
        
        while(j<s.length()){
            char chToAdd=s.charAt(j);

            while(set.contains(chToAdd)){
                char chToRemove=s.charAt(i);
                set.remove(chToRemove);
                i++;
            }
            set.add(chToAdd);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}