class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int max_area = 0;

        for(int i =0; i < n; i++){
            for(int j =0; j < m; j++){
                if(grid[i][j] == 1){
                    
                    max_area = Math.max(max_area, dfs(grid, i, j));
                }
            }
        }

        return max_area;
        
    }

    private int dfs(int[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        int area = 1;

        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != 1) return 0;
        grid[i][j] = 0;
        area += dfs(grid, i, j + 1);
        area += dfs(grid,  i + 1, j);
        area += dfs(grid, i, j - 1);
        area += dfs(grid, i - 1, j);

        return area;
    } 
}