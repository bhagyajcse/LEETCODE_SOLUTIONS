class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,x=0;
        while(i<=j && j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        for(x=i;x<nums.length;x++){
                nums[x]=0;
        }
    }
}