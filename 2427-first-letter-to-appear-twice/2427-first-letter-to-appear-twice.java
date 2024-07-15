class Solution {
    public char repeatedCharacter(String s) {
        int [] freq = new int[26];
        int i;
        for(i=0;i<s.length();i++)
        {
            freq[s.charAt(i) - 'a']++;
            if(freq[s.charAt(i) -'a']==2)
                return s.charAt(i);
        }
    
        return s.charAt(i);
    }
}