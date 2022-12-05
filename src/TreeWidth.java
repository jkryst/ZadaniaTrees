import java.util.LinkedList;
import java.util.Queue;

public class TreeWidth {
    public static void main(String[] args){

        Tree t1 = new Tree(5);
        t1.right = new Tree(8);
        t1.right.right = new Tree(9);
        t1.right.left = new Tree(6);

        t1.left = new Tree(3);
        t1.left.right = new Tree(3);
        t1.left.left = new Tree(2);

        Tree.print2D(t1);
        traverseBinaryTree(t1);

    }

    public static void traverseBinaryTree(Tree root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Tree> queue = new LinkedList<Tree>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Tree node = queue.poll();
            System.out.printf("%d ", node.value);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
