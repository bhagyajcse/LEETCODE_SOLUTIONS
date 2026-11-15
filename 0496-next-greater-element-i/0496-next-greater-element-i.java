class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums1.length;i++){
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            st.push(nums2[k]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        st.push(-1);
                    }
                }
            }
        }
        int[] arr=new int[st.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=st.get(i);
        }
        return arr;
    }
}