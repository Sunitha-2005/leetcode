class Solution {
    public boolean validfun(int[][] matrix, int x, int y) {
        int r = matrix.length;
        int c = matrix[0].length;
        int i = x;
        int j = y;
        int temp = matrix[i][j];
        boolean valid = true;
        while (i < r && j < c) {
            if (matrix[i][j] != temp) {
                valid = false;
                break;  
            }
            i++;
            j++;
        }
        return valid;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans = true;
        int r = matrix.length;
        int c = matrix[0].length;
        for (int j = 0; j < c; j++) {
            if (!validfun(matrix, 0, j)) {
                ans = false;
                break;  
            }
        }
        for (int i = 1; i < r; i++) {
            if (!validfun(matrix, i, 0)) {
                ans = false;
                break;  
            }
        }
        
        return ans;
    }
}

    