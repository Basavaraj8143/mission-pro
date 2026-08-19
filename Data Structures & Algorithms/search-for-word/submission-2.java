class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(find(i,j,board,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
        
        public boolean find(int i,int j,char[][]board,String word,int idx){
            if(idx==word.length()){
                return true;
            }
            if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(idx)){ 
               return false;
            }
            char cur=board[i][j];
            board[i][j]='#';
            boolean found=find(i-1,j,board,word,idx+1)||find(i+1,j,board,word,idx+1)||find(i,j-1,board,word,idx+1)||find(i,j+1,board,word,idx+1);
            board[i][j]=cur;
             return found;
        }
       
    }

