package Problem5;

import Common.TreeNode;
import Problem3.ListNode;
import Problem3.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BinaryTree<T> {
    private final TreeNode<T> root;

    public BinaryTree(TreeNode<T> root) {
        this.root = root;
    }

    @Override
    public boolean equals(Object otherTree) {
        if (otherTree == this) {
            return true;
        }

        if (!(otherTree instanceof BinaryTree)) {
            return false;
        }

        BinaryTree<T> treeOther = (BinaryTree<T>) otherTree;
        TreeNode<T> mover1 = this.root;
        TreeNode<T> mover2 = treeOther.root;
        return traverseTree(mover1, mover2);
    }

    private boolean traverseTree(TreeNode<T> root1, TreeNode<T> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (!root1.val.equals(root2.val)) {
            return false;
        }
        return traverseTree(root1.left, root2.left) && traverseTree(root1.right, root2.right);
    }
}