//BRUTE FOR APPROACH
/*import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int freq=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    freq++;
                }
            }
            if(freq>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}*/

//MOORE'S VOTING ALGO
class Solution {
    public int majorityElement(int[] nums) {
        int freq=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
    }
}