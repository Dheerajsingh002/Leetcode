class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        int[] e=new int[n+1];
        for(int[] edge:edges){
            int x=edge[0];
            int y=edge[1];
            e[x]++;
            e[y]++;
            if(e[x]>1) return x;
            if(e[y]>1) return y;
            
        }
        return 0;
    }
}