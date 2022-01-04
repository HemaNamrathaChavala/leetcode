import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,r=0;
        int n=x;
        if(x<0)
            return false;
        while(x>0)
        {
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(sum==n)
            return true;
        else
            return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution s=new Solution();
        System.out.println(s.isPalindrome(x));
    }
}
