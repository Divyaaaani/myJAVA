class Solution {
    static final long MOD = 1_000_000_007;

    public long maxBinaryValue(int[] A, int[] B) {
        int n = A.length;
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        reverse(A);
        reverse(B);

        int maxSum = 0;
        for (int x : A) maxSum += x;
        for (int x : B) maxSum += x;

        long[] pow2 = new long[maxSum + 1];
        pow2[0] = 1;
        for (int i = 1; i <= maxSum; i++) pow2[i] = (pow2[i - 1] * 2) % MOD;

        return Math.max(build(A, B, pow2, true), build(A, B, pow2, false));
    }

    long build(int[] A, int[] B, long[] pow2, boolean startWithOne) {
        int i = 0, j = 0;
        long val = 0;
        boolean isOne = startWithOne;

        while (i < A.length || j < B.length) {
            if (isOne) {
                int k = A[i++];
                val = (val * pow2[k]) % MOD;
                val = (val + (pow2[k] - 1 + MOD) % MOD) % MOD;
            } else {
                int k = B[j++];
                val = (val * pow2[k]) % MOD;
            }
            isOne = !isOne;
        }
        return val;
    }

    void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
}