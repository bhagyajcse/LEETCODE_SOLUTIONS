class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int x = 0;
        double pow = Math.pow(2, x);

        while (pow < n) {
            x++;
            pow = Math.pow(2, x);
        }
        return pow == n;
    }
}