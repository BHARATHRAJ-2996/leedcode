class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int bh=s.lastIndexOf(' ');
        return s.length()-bh-1;
    }
}