class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids = new ArrayList<>();
        int max=0;

        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                kids.add(true);
            }else{
                kids.add(false);
            }
        }
        return kids;
    }
}