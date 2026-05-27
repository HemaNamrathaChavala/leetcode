class Solution {
    public int commonFactors(int a, int b) {
        
int g = gcd(a, b);
        int count = 0;

        for (int i = 1; i * i <= g; i++) {
            if (g % i == 0) {
                count++;
                if (i != g / i) count++;
            }
        }
        return count;
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;

    }
}
