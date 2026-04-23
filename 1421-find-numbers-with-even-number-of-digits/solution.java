class Solution {
    public int findNumbers(int[] nums) {
        int totalcount = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i];

            // while (num > 0) {
            //     num /= 10;
            //     count++;
            // }

            // if (count % 2 == 0) {
            //     totalcount++;
            // }
            if((num>=10 && num<=99) || (num>=1000 && num<=9999) || (num==100000)){
                totalcount++;
            }
        }

        return totalcount;
        
    }
}
