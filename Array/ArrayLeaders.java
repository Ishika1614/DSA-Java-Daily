class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
       ArrayList<Integer> list = new ArrayList<>(); 
       for(int i = 0; i<arr.length; i++) {   
           boolean isLeader = true;
           for(int j = i+1; j<arr.length; j++){
           if(arr[i] <arr[j]){  
               isLeader = false;
               break;
           }  

           }    
           if(isLeader){ 
               
             list.add(arr[i]); 
           }

       }
        return list;
    }
}
