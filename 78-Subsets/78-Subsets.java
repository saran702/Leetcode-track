// Last updated: 09/02/2026, 13:34:08
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> cur_arr, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(cur_arr)); // Add a copy of the current subset
            return;
        }

        // Include the current element
        cur_arr.add(nums[index]);
        backtrack(index + 1, nums, cur_arr, result);

        // Exclude the current element (backtrack)
        cur_arr.remove(cur_arr.size() - 1);
        backtrack(index + 1, nums, cur_arr, result);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2};
        List<List<Integer>> result = sol.subsets(nums);
        System.out.println(result);
    }
}
