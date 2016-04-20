package com.robin;

public class Solution_3 {
	
	
	public int[] twoSum(int[] nums, int target) {
		int[] result = {0, 0};
        int count = nums.length;

        for (int i = 0; i < count ; i++) {
            for (int j = i + 1 ; j < count; j++) {
                System.out.println(String.format("i:%d\tj:%d", i, j));
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

		return result;

	}
}
