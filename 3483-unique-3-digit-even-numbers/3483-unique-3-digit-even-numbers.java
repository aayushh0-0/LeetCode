class Solution {
    public int totalNumbers(int[] digits) {

        int[] f = new int[10];

        for (int i : digits) {
            f[i]++;
        }
        int count = 0;
        for (int i = 0; i <= 8; i += 2) {
            if (f[i] == 0) {
                continue;
            }
            f[i]--;
            for (int j = 1; j <= 9; j++) {
                if (f[j] == 0) {
                    continue;
                }
                f[j]--;
                for (int k = 0; k <= 9; k++) {
                    if (f[k] > 0) {
                        count++;
                    }
                }
                f[j]++;
            }
            f[i]++;
        }
        return count;
    }
}