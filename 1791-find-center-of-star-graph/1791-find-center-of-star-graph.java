import java.util.HashSet;
import java.util.Set;
class Solution {
    public int findCenter(int[][] edges) {
      Set<Integer> outEdgesFound=new HashSet<>();
        for(int[] edge:edges){
            if(outEdgesFound.contains(edge[0]))
            {
                return edge[0];
            }
            outEdgesFound.add(edge[0]);
            if(outEdgesFound.contains(edge[1])){
                return edge[1];
            }
            outEdgesFound.add(edge[1]);
        }
        return -1;
      
    }
}