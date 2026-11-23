class Solution {
    public String[] assignUmbrella(int[] rain) {
        int ACount=0, 
            BCount=0;
        int n=rain.length;
        String[] ans=new String[n];

        for(int i=0;i<n;i++){
            if(rain[i]==0){
                ans[i]="None";
            }
            else if(i<n-1 && rain[i+1]==1 && ACount<=BCount){
                ans[i]="Alice";
                ACount++;
            }
            else{
                ans[i]="Bob";
                BCount++;
            }
        }

        return ans;
    }
}