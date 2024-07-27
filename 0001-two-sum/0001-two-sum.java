class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i < nums.length;i++){

            int c = target - nums[i];

            if(h.containsKey(c)){
                return new int[] {h.get(c),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}





















// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] + nums[j] == target){
//                     ans[0] = i;
//                     ans[1] = j;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }
