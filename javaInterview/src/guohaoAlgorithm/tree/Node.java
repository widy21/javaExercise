package guohaoAlgorithm.tree;

/**
 * @author:guohao
 * @email 1163753605@qq.com
 * @date: 2021/1/7 18:08
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
