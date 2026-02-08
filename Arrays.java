
//leetcode:268->MissingNumber

import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        // case 1: 0 is missing
        if (nums[0] != 0) return 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1;
            }
        }

        // case 2: last number is missing
        return nums.length;
    }
}
