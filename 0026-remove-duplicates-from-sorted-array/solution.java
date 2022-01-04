class Solution {
    public int removeDuplicates(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i< arr.length-1 && arr[i]==arr[i+1])
            {
                continue;
                
            }
            arr[count]=arr[i];
            count++;
        }
        return count;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution s=new Solution();
        System.out.println(s.removeDuplicates(arr)+", nums="+arr);
    }
}

