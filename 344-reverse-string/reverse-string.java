class Solution {
    public void reverseString(char[] s) {
        int bh=0;
        int ah=s.length-1;
        while(bh<ah){
        char t = s[bh];
        s[bh]=s[ah];
        s[ah]=t;
        bh++;
        ah--;    
        }
    }
}