class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ans[i]=rec(i);
            
        }
        return ans;
        
    }
    private static int rec(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        if(num%2==0) return rec(num/2);
        else return 1+rec(num/2);
        
    }
}