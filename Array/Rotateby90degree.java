class Solution { 
    public void swap(int[][] mat,int i, int j) { 
        int temp = mat[i][j]; 
        mat[i][j] = mat[j][i]; 
        mat[j][i] = temp;
        
    }
    public void rotateMatrix(int[][] mat) { 
        int n = mat.length; 
       for(int i = 0; i<n; i++) { 
           for(int j = 0; j<i;j++){ 
               swap(mat, i, j);    // here i get the transpose
           }
       }  
       
       //swap for anticlockwise 
        
        for(int col = 0; col <n; col++){
            int top = 0; int bottom = n-1; 
            
            while(top<bottom){ 
                int temp = mat[top][col]; 
                mat[top][col] = mat[bottom][col]; 
                mat[bottom][col] = temp;  
                top++; 
                bottom--;
        
        }}
    }
}
