class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        
        ArrayList<Integer> myList = new ArrayList<>();  
        
        int n = mat.length; 
        int m = mat[0].length;
        
        int rowBegin = 0; 
        int rowEnd = n - 1; 
        int colStart = 0; 
        int colEnd = m - 1; 
        
        while(rowBegin <= rowEnd && colStart <= colEnd) {

            // Traverse Right
            for(int i = colStart; i <= colEnd; i++) { 
                myList.add(mat[rowBegin][i]);
            } 
            rowBegin++; 

            // Traverse Down
            for(int i = rowBegin; i <= rowEnd; i++) { 
                myList.add(mat[i][colEnd]); 
            } 
            colEnd--;

            // Traverse Left
            if(rowBegin <= rowEnd) {
                for(int i = colEnd; i >= colStart; i--) { 
                    myList.add(mat[rowEnd][i]); 
                } 
                rowEnd--;  
            }

            // Traverse Up
            if(colStart <= colEnd) {
                for(int i = rowEnd; i >= rowBegin; i--) { 
                    myList.add(mat[i][colStart]); 
                } 
                colStart++; 
            }
        } 
        
        return myList;
    }
}
