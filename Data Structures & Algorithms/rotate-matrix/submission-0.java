class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [][]ans=new int[matrix.length][matrix[0].length];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
            }
        }  
            
     for (int i = 0; i < m; i++) {
            int left = 0;
            int right = m - 1; // Correct 0-indexed boundary!
            while (left < right) {
                int temp = ans[i][left];
                ans[i][left] = ans[i][right];
                ans[i][right] = temp;
                left++;
                right--;
            }
        }
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=ans[i][j];
            }
        }  
         
    }
}
