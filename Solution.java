public class Solution {
    // Định nghĩa lớp TreeNode
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Định nghĩa hàm maxDepth
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // Hàm main để thử chạy
    public static void main(String[] args) {
        // Tạo cây ví dụ: [3, 9, 20, null, null, 15, 7]
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode node9 = new TreeNode(9);
        TreeNode root = new TreeNode(3, node9, node20);

        // Tạo đối tượng Solution và gọi hàm maxDepth
        Solution solution = new Solution();
        int maxDepth = solution.maxDepth(root);

        // In ra kết quả
        System.out.println("Maximum depth of the binary tree is: " + maxDepth);
    }
}
