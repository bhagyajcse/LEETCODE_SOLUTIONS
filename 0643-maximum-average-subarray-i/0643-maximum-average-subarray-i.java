class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxum=Double.NEGATIVE_INFINITY;
        int sum=0,i=0;
        int j=0;
        double avg_sum=0;
        for(j=0;j<k;j++){
            sum=sum+nums[j];
            avg_sum=(double)sum/k;
        }
        maxum = Math.max(maxum, avg_sum);
        while(j<nums.length){
            sum=sum+nums[j];
            sum=sum-nums[i];
            avg_sum=(double)sum/k;
            i++;
            j++;
            maxum=Math.max(maxum,avg_sum);
        }
        return maxum;
    }
}