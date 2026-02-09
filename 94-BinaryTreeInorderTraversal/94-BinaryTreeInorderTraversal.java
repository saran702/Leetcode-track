// Last updated: 09/02/2026, 13:34:07
import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // 1. Go left and push nodes onto the stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // 2. Pop and visit the current node
            current = stack.pop();
            result.add(current.val);
            
            // 3. Move to the right subtree
            current = current.right;
        }
        
        return result;
    }
}