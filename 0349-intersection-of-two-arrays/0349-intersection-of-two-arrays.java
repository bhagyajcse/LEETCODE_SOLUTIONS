
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> h=new HashSet<>();
        int k = 0;
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    h.add(nums1[i]);
                    break;
                }
            }
        }
        int[] ans=new int[h.size()];
        int i = 0;
        for(int num : h) {
            ans[i]=num;
            i++;
        }

        return ans;
    }
}
