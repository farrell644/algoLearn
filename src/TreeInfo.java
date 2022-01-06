public class TreeInfo {
    public boolean isblanced;
    public Integer maxLen;

    public boolean isIsblanced() {
        return isblanced;
    }

    public TreeInfo() {
    }

    public TreeInfo(TreeInfo treeInfo) {
        this.maxLen = treeInfo.maxLen;
        this.isblanced = treeInfo.isblanced;
    }

    public void setIsblanced(boolean isblanced) {
        this.isblanced = isblanced;
    }

    public Integer getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(Integer maxLen) {
        this.maxLen = maxLen;
    }

    public TreeInfo(boolean isblanced, Integer maxLen) {
        this.isblanced = isblanced;
        this.maxLen = maxLen;
    }
}
