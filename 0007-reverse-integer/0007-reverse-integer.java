class Solution {
    public int reverse(int x) {
        // int i = (x < 0) ? -1 : 1;
        // x = Math.abs(x);
        int sum = 0;
        while(x != 0){

            if((sum < Integer.MIN_VALUE / 10) || (sum > Integer.MAX_VALUE /10)){
                return 0;
            }
            int digit = x % 10;
            sum = (sum * 10) + digit;
            x /= 10;

            
        }
        return sum;
    }
}