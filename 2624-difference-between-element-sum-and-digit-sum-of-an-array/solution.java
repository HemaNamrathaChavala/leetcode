class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0, digitsum=0;
        for(int i=0; i<nums.length; i++){
            elesum+=nums[i];
            int temp = nums[i];
            while (temp > 0) {
                digitsum += temp % 10;
                temp /= 10;
            }

        }
        return Math.abs(elesum - digitsum);
    }
}
