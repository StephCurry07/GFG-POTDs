public class Sep29_numEnclaves {
    int[] dir_x = {-1, 0, 1, 0};
    int[] dir_y = {0, 1, 0, -1};
    void dfs(int[][] grid, int x, int y, int n, int m, boolean[][] vis){
        vis[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dir_x[i];
            int ny = y + dir_y[i];
            if(nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == 1 && !vis[nx][ny]){
                dfs(grid, nx, ny, n, m, vis);
            }
        }
    }
    int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            if(grid[i][0] == 1 && !vis[i][0]){
                dfs(grid, i, 0, n, m, vis);
            }
            if(grid[i][m-1] == 1 && !vis[i][m-1]){
                dfs(grid, i, m - 1, n, m, vis);
            }
        }
        
        for(int j = 0; j < m; j++){
            if(grid[0][j] == 1 && !vis[0][j]){
                dfs(grid, 0, j, n, m, vis);
            }
            if(grid[n - 1][j] == 1 && !vis[n-1][j]){
                dfs(grid, n - 1, j, n, m, vis);
            }
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !vis[i][j])
                    count++;
            }
        }
        return count;
    }
}
