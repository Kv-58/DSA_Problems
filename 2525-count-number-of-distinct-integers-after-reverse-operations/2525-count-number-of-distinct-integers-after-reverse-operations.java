class Solution {
    public int countDistinctIntegers(int[] nums) {
        int sum = 0;
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            h.add(nums[i]);
        }System.out.println(h);
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            while(nums[i] != 0){
                int digit = nums[i] % 10;
                sum = sum * 10 + digit;
                nums[i] /= 10;
            }
            h.add(sum);
        }
        
        System.out.println(h);
        return h.size();
        
    }
}