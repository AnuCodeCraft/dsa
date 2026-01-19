class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet<>();

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char number = board[i][j];
                if(number != '.'){
                    if(!seen.add(number + "in rows" + i)) return false;
                    if(!seen.add(number + "in columns" + j)) return false;
                    if(!seen.add(number + "in block"+ j/3 + "_" + i/3)) return false;
                }
            }
        }

        return true;
        
    }
}