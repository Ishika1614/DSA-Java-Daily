class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>(); 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int n = arr.length;
        for(int num : arr){ 
            map.put(num, map.getOrDefault(num,0)+1); 
        }  
        int rep = -1;
        for(int key : map.keySet()) { 
            if(map.get(key) == 2 ){ 
                rep = key; 
                break;
            } 
        } 
        int missing = -1; 
        
        for(int i = 1 ; i<=n; i++) {  
            
            if(!map.containsKey(i)) 
                 { 
                missing = i; 
                break;
        }  
        }  
        res.add(rep);
        res.add(missing);
        
         return res;
    }
}
