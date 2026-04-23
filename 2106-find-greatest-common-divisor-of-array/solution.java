class Solution {
    public int findGCD(int[] nums) {
        int len= nums.length;
        int mx= nums[0];
        int min=mx;
        for(int i=0; i<len; i++){
            if(nums[i]> mx){
                mx=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        while(min!=0){
            int temp=mx;
            mx= min;
            min=temp%min;
        }
        return mx;
    }
}
