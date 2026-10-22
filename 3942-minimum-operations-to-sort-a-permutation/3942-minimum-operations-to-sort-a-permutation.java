import java.util.function.IntPredicate;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        final int z = zero;

        IntPredicate check = step -> {
            for (int i = 1; i < n; i++) {
                int prev = (z + (i - 1) * step + n) % n;
                int curr = (z + i * step + n) % n;

                if (nums[prev] > nums[curr]) {
                    return false;
                }
            }
            return true;
        };

        int ans = Integer.MAX_VALUE;

        if (check.test(1)) {
            ans = Math.min(ans, zero);
            ans = Math.min(ans, n - zero + 2);
        }

        if (check.test(-1)) {
            ans = Math.min(ans, zero + 2);
            ans = Math.min(ans, n - zero);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}