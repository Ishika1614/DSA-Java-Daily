class Solution {
    public void mergeArrays(int a[], int b[]) { 
        
        int n = a.length; 
        int p = b.length; 
        int i = 0; 
        int j = 0;  
        int k = 0;
        int temp[]  = new int[n+p];
        
        while(i<a.length && j<b.length){   
            
             if(a[i] >= b[j]){  
                 temp[k++] = b[j++]; 
            } 
            else{ 
                temp[k++] = a[i++]; 
               
            }  
        }
            while(i <n){ 
                temp[k++] = a[i]; 
                i++; 
            } 
            while(j < p) { 
                temp[k++] = b[j]; 
                j++; 
            } 
    for(int x = 0; x<n; x++) { 
        a[x] = temp[x]; 
      
    } 
    for(int x = 0; x<p; x++) { 
        b[x] = temp[n+x]; 
}
}
}
