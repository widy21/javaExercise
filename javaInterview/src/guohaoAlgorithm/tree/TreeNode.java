package guohaoAlgorithm.tree;

/**
 * @author:guohao
 * @email 1163753605@qq.com
 * @date: 2020/12/6 9:30
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}