class Solution {
public:
    int hammingDistance(int x, int y) {
         int ans=0;
        int temp=x^y;
        while(temp!=0)
        {
            if(temp & 1)
            {
                ans++;
            }
            temp=temp>>1;
        }
        return ans;
        
    }
};