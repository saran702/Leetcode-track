// Last updated: 09/02/2026, 13:33:57
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<indices.length;i++)
        {
            sb.setCharAt(indices[i],s.charAt(i));       
        }
        return sb.toString();
    }
}