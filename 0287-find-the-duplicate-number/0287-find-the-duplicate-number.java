class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0,r=0;
        int res=0;
        while(i<nums.length){
            if(map.containsKey(nums[i])){
                res=nums[i];
                break;
            }
            map.put(nums[i],i);
            i++;
        }
        return res;
    }
}