class Solution {
    public int arrangeCoins(int n) {
        int l =0,c=1;
        while(n>=c)
        {
            n-=c;
            c++;
            l++;
            
        }
        return l;
        
        
    }
}