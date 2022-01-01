class Solution {
    public int[] twoSum(int[] nums, int target) {
         int b[]={0,0},flag=0,j=0,i=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
               
                if(nums[i]+nums[j]==target)
                {
                     flag=1;
                    break;
                } 
                
                
            }
            if(flag==1)
                {
                    b[0]=i;
                    b[1]=j;
                    break;
                
                }
                   
           
        }
         return b;
       
    }
     public static void main(String args[])
    {
        Solution s= new Solution();
        Scanner sc = new Scanner(System.in);
         int t= sc.nextInt();
        int a[]=new int[10];
         int i=0;
        while(i>=0)
        {
            a[i]=sc.nextInt();
        }
        int b[]=s.twoSum(a,t);
         
           System.out.println("["+b[0]+", "+b[1]+"]");
        
        
    }
}
