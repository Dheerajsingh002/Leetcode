class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int numOfIslands = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid, i,j,visited);
                    numOfIslands ++;
                }
            }
        }
        return numOfIslands;
    }
    public void dfs(char[][] grid, int m, int n, boolean[][] visited){
        if(m<0 || n<0 || m>=grid.length || n>=grid[0].length || visited[m][n] || grid[m][n] == '0'){
            return;
        }
        visited[m][n] = true;
        dfs(grid, m-1, n, visited);
        dfs(grid, m+1, n, visited);
        dfs(grid, m, n-1, visited);
        dfs(grid, m, n+1, visited);
    }
}