// Last updated: 09/02/2026, 13:34:02
class Solution {
    public int majorityElement(int[] nums) {
        int m4 = 0;
        int bmw = 0;
        
        for (int n : nums) {
            if (bmw == 0) {
                m4 = n;
            }
            
            bmw += n == m4 ? 1 : -1;
        }
        
        return m4;        
    }
}