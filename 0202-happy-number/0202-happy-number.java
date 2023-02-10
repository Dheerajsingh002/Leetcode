class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
         while(n!=1 && !set.contains(n)){
             set.add(n);
             n=getNext(n);
         }
         return n==1;
    }
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}