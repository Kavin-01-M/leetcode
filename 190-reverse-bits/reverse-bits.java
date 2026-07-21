class Solution {
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            int bit = n & 1;     // Extract last bit

            ans = ans << 1;      // Shift answer left

            ans = ans | bit;     // Add extracted bit

            n = n >>> 1;         // Unsigned right shift
        }

        return ans;
    }
}