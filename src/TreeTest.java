public class TreeTest {
        public boolean isBalanced(TreeNode treeNode) {

            TreeInfo treeInfo = new TreeInfo();
            treeInfo=blancefunc(treeNode);
            return treeInfo.isblanced;
        }
        class TreeInfo(TreeInfo treeInfo) {
            this.maxLen = treeInfo.maxLen;
            this.isblanced = treeInfo.isblanced;
        }
        public static TreeInfo blancefunc(TreeNode treeNode){
            TreeInfo treeInfo = new TreeInfo();
            if(null==treeNode)
            {
                treeInfo.isblanced = true;
                treeInfo.maxLen =0;
                return  treeInfo;
            }
            TreeInfo leftInfo = blancefunc(treeNode.left);
            TreeInfo rightInfo = blancefunc(treeNode.right);
            treeInfo.maxLen = Math.max(leftInfo.maxLen, rightInfo.maxLen);
            if(leftInfo.maxLen-rightInfo.maxLen>=2||leftInfo.maxLen-rightInfo.maxLen<=-2||leftInfo.isblanced==false||rightInfo.isblanced==false)
                treeInfo.isblanced = false;
            else treeInfo.isblanced = true;
            return treeInfo;
        }
}
