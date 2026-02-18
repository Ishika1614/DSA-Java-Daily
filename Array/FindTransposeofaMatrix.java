
 
static void swap(int N, int mat[][N], int i, int j){ 
    int temp = mat[i][j]; 
    mat[i][j] = mat[j][i]; 
    mat[j][i] = temp; 
}
 
 
 
 
void transpose(int N, int mat[][N]) {
    for(int i = 0; i<N; i++){ 
        for(int j = 0; j<i; j++) { 
            swap(N,mat,i,j); 
        } 
    }
    
}
