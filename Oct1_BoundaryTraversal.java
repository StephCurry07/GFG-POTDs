import java.util.ArrayList;

public class Oct1_BoundaryTraversal {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> ans = new ArrayList();
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;
        int left = 0;
        for (int i = left; i <= right; i++) {
            ans.add(matrix[top][i]);
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            ans.add(matrix[i][right]);
        }
        right--;
        if (bottom >= top) {
            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if (right >= left) {
            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}
