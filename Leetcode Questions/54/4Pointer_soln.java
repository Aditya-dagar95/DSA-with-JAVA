class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList();

        int row = matrix.length, col = matrix[0].length;

        int left = 0, right = col - 1;
        int top = 0, down = row - 1;

        for(int seen = 0; seen < row * col;){

            for(int i = left; i <= right; i++){

                if(seen == row * col)break;

                res.add(matrix[top][i]);
                seen++;
            }
            top++;

            for(int j = top; j <= down; j++){
                
                if(seen == row * col)break;

                res.add(matrix[j][right]);
                seen++;
            }
            right--;

            for(int i = right; i >= left; i--){

                if(seen == row * col)break;

                res.add(matrix[down][i]);
                seen++;
            }
            down--;

            for(int j = down; j >= top; j--){

                if(seen == row * col)break;
                
                res.add(matrix[j][left]);
                seen++;
            }
            left++;
        }

        return res;
    }
}
