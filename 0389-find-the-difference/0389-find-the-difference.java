class Solution {
    public char findTheDifference(String s, String t) {
    char c=0;
        for(char cs:s.toCharArray()) c^=cs;
        for(char cs:t.toCharArray()) c^=cs;
        return c;
        
    }
}