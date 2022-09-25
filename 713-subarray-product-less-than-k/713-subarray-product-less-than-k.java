class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int len=nums.length;
        // int prod=0;
        // if(len<=1){
        //     return 0;
        // }
        // int count=0;
        // for(int i=0;i<=len-1;i++){
        //     prod=nums[i];
        //     if(prod<k){
        //         count++;
        //     }
        //     for(int j=i+1;j<=len-1 && prod<k;j++){
        //         prod*=nums[j];
        //         if(prod<k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        if(k<=1) return 0;
        int count=0;
        int left=0;
        int prod=1;
        for(int r=0;r<nums.length;r++){
            prod*=nums[r];
        while(prod>=k){
            prod/=nums[left++];
        }
        count+=r-left+1;
        }
        return count;
        
    }
    
}