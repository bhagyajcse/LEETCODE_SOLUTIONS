class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int moves=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                moves+=max-nums[i];
            }
        }
        return moves;
    }
}