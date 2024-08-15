class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int even_count = 0;
        int rem = 0;

        for(int i = 0; i < nums.length; i++)
        {
            count = 0;
            while(nums[i] > 0)
            {
                rem = nums[i] % 10;
                count++;
                nums[i] /= 10;
            }

            if(count % 2 == 0)
            {
                even_count++;
            }

        }
        return even_count;

    }
}