class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
        
    }
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        Solution s=new Solution();
        System.out.println(s.reverse(x));
    }
}
