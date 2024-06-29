class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        

       List<Integer> res = new LinkedList<>();

        if (matrix == null || matrix.length == 0)
            return res;
        
        int minr = 0, minc = 0;
        int maxr = matrix.length - 1, maxc = matrix[0].length - 1;
        int totalElements = matrix.length * matrix[0].length;
          
        while (res.size() < totalElements) {
            
            // Traverse from left to right along the top row
            for (int j = minc; j <= maxc && res.size() < totalElements; j++) {
                res.add(matrix[minr][j]);
            }
            minr++;
             
            // Traverse from top to bottom along the right column
            for (int i = minr; i <= maxr && res.size() < totalElements; i++) {
                res.add(matrix[i][maxc]);
            }
            maxc--;

            // Traverse from right to left along the bottom row
            for (int j = maxc; j >= minc && res.size() < totalElements; j--) {
                res.add(matrix[maxr][j]);
            }
            maxr--;

            // Traverse from bottom to top along the left column
            for (int i = maxr; i >= minr && res.size() < totalElements; i--) {
                res.add(matrix[i][minc]);
            }
            minc++;
            }
       return res;
    }
}