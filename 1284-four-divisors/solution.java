class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0; i< nums.length; i++){
            ans += getContributon(nums[i]);
        }
        return ans;
    }

    public int getContributon(int num){
        int count = 0, sum =0;
        for(int i=1; i*i <= num && count <=4; i++){
            if(num%i==0){
                if(i*i== num) return 0;
                count +=2;
                sum+= i;
                sum+= num/i;
            }
        }
        return count == 4 ? sum : 0;
    }
}
