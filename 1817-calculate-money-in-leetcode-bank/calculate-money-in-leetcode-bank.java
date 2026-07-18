class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int monday = 1;

        while (n > 0) {
            int days = Math.min(n, 7);

            for (int i = 0; i < days; i++) {
                ans += monday + i;
            }

            n -= 7;
            monday++;
        }

        return ans;
    }
}