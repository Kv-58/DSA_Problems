class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num < 10)   return true;

        if(num % 10 == 0)   return false;
        else    return true;   
    }
}