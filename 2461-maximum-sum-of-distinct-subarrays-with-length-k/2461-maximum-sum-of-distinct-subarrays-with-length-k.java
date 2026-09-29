class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long max = 0;
        int dups = 0;

        for (int i = 0; i < k; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                dups++;
            } else {
                map.put(nums[i], 1);
            }

            sum += nums[i];
        }

        if (dups == 0) {
            max = Math.max(max, sum);
        }

        for (int i = k; i < nums.length; i++) {

            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            if (map.containsKey(numToAdd)) {
                map.put(numToAdd, map.get(numToAdd) + 1);
                dups++;
            } else {
                map.put(numToAdd, 1);
            }

            sum += numToAdd;

            // Remove old element
            if (map.get(numToRemove) > 1) {
                dups--;
            }

            map.put(numToRemove, map.get(numToRemove) - 1);

            if (map.get(numToRemove) == 0) {
                map.remove(numToRemove);
            }

            sum -= numToRemove;
            if (dups == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}