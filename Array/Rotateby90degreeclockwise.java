// User function Template for Java

class GFG { 
    
    static void swap(int mat[][], int i, int j) { 
        int temp = mat[i][j]; 
        mat[i][j] = mat[j][i]; 
        mat[j][i] = temp; 
    }
    static void rotate(int mat[][]) { 
        int n = mat.length;
       for(int i = 0; i<n; i++) { 
           for(int j = 0; j<i; j++) { 
               swap(mat,i,j); 
           } 
       }
        //now rotate cloclwise
        
        for(int row = 0; row<n; row++) { 
            int start = 0; int end = n-1; 
            while(start < end) { 
                int temp = mat[row][start]; 
                mat[row][start] = mat[row][end]; 
                mat[row][end] = temp; 
                start++; end--; 
            } 
        }
    }
}
