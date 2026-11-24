class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> st=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            st.add(nums2[k]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        st.add(-1);
                    }
                }
            }
        }
        int[] arr=new int[st.size()];
        for(int i=0;i<st.size();i++){
            arr[i]=st.get(i);
        }
        return arr;
    }
}