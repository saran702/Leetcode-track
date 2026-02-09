// Last updated: 09/02/2026, 13:34:01
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int s = 0;

        for (int start = 0; s < n; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                s++;
            } while (start != current);
        }
    }
}