import java.util.Arrays;

public class Sep4_changeOtoX {
    static void dfs(char[][] grid, char[][] vis, int x, int y, int n, int m){
        vis[x][y] = 'N';
        int[] dir_x = {1, 0, 0, -1};
        int[] dir_y = {0, -1, 1, 0};
        for(int i = 0; i < 4; i++){
            int nx = dir_x[i] + x;
            int ny = dir_y[i] + y;
            if(nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny] == 'O' && vis[nx][ny] != 'N'){
                dfs(grid, vis, nx, ny, n, m);
            }
        }
    }
    static char[][] fill(int n, int m, char a[][]){
        char[][] vis = Arrays.stream(a).map(char[]::clone).toArray(char[][]::new);
        for(int i = 0; i < n; i++){
            if(a[i][0] == 'O' && vis[i][0] != 'N'){
                dfs(a, vis, i, 0, n, m);
            }
            if(a[i][m-1] == 'O'  && vis[i][m - 1] != 'N'){
                dfs(a, vis, i,  m - 1, n, m);
            }
        }
        for(int j = 0; j < m; j++){
            if(a[0][j] == 'O'  && vis[0][j] != 'N'){
                dfs(a, vis, 0, j, n, m);
            }
            if(a[n-1][j] == 'O'  && vis[n - 1][j] != 'N'){
                dfs(a, vis, n - 1, j, n, m);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j] == 'O'){
                    a[i][j] = 'X';
                }
                else{
                    
                }
            }
        }
        return a;
    }
}
