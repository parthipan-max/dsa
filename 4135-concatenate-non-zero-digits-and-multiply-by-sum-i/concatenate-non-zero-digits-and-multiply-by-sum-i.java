class Solution {
    public long sumAndMultiply(int n) {
        int p = 1;
        int x = 0;
        int s = 0;

        while (n > 0) {
            int v = n % 10;
            s += v;

            if (v != 0) {
                x += p * v;
                p *= 10;
            }

            n /= 10;
        }

        return 1L * x * s;
    }
}