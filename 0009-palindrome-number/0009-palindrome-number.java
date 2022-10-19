class Solution {
    public boolean isPalindrome(int x) {
        int result=0,y=x;
        if(x<0){
            return false;
        }
        while(y>0){
            int rem=y%10;
            result=result*10+rem;
            y/=10;   
        }
        if(result==x){
            return true;
        }
        return false;
    }
}