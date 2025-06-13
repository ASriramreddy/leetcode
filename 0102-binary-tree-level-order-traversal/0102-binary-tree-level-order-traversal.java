public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> ans) {
        if (node == null) return;

        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(node.val);
        dfs(node.left, level + 1, ans);
        dfs(node.right, level + 1, ans);
    }
}
