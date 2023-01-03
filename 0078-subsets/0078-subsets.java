class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
        backtrace(nums,0,new ArrayList<Integer>(),ans);
        return ans;   
    }
    public void backtrace(int[] nums,int start,List<Integer> track,List<List<Integer>> ans){
        ans.add(new ArrayList<>(track));
        for(int i=start;i<nums.length;i++)
        {
            track.add(nums[i]);
            backtrace(nums,i+1,track,ans);
            track.remove(track.size()-1);
        }
    }
}