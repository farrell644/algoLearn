public class TreeValid {
        public static boolean isValidBST(TreeNode root) {
            return isvalid(root);
        }
        public static boolean isvalid(TreeNode treeNode){
            if(treeNode.left!=null)
                if(treeNode.left.val >=treeNode.val) return false;
            if(treeNode.right!=null)
                if(treeNode.right.val<=treeNode.val)return false;
            while(treeNode.left!=null&&treeNode.right!=null){
                return isvalid(treeNode.left)&&isvalid(treeNode.right);
            }
            return true;
        }
        public TreeNode convertToTreeNode(int[] arr)
        {
            TreeNode p = new TreeNode();
            TreeNode treeNode = p;
            for (int i = 0,k = 0; i < arr.length; i++) {
                treeNode.val = arr[i];
                if(k==0){
                    treeNode = null;
                    k =1;
                }
                if(k==1){
                    k = 0;
                }
            }
            return p;
        }
}
