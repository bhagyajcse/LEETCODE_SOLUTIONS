class Solution {
    public static int sumofdigit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=sumofdigit(slow);
            fast=sumofdigit(sumofdigit(fast));

            if(fast==1){
                return true;
            }
            if(slow==fast){
                return false;
            }
        }
        return true;
    }
}