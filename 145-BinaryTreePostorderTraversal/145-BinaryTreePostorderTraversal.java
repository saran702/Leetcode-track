// Last updated: 09/02/2026, 13:34:03
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Traverse left subtree
        traverse(node.left, result);
        // Traverse right subtree
        traverse(node.right, result);
        // Visit the root
        result.add(node.val);
    }
}