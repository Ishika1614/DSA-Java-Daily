import java.util.Arrays;

class Solution {
    int missingNum(int arr[]) {

        Arrays.sort(arr);

        // Case 1: missing number is 1
        if(arr[0] != 1){
            return 1;
        }

        // Check in between
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1] + 1){
                return arr[i - 1] + 1;
            }
        }

        // Case 3: missing number is last
        return arr[arr.length - 1] + 1;
    }
}
