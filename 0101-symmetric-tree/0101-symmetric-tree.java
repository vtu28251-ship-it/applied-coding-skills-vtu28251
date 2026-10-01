
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        else{
            return isMirror(root.left,root.right);
        }
    }
        boolean isMirror(TreeNode p, TreeNode q){   
            if(p==null && q==null){
                return true;
            }
            if(p==null || q==null){
                return false;
            }
            if(p.val!=q.val){
                return false;
            }
            else{
                return isMirror(p.left,q.right) && isMirror(p.right,q.left);
            }
        }
}