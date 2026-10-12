class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> a = new ArrayList<>();
    helper(root,a);
    return a;        
    }
    public void helper(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null) return;
        helper(root.left,a);
        helper(root.right,a);
        a.add(root.val);
    }
}