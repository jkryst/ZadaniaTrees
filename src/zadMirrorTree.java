public class zadMirrorTree {

    public static void main(String[] args) {

        Tree t = new Tree(5);
        t.right = new Tree(4);
        t.right.right = new Tree(7);
        t.right.left = new Tree(8);

        t.left = new Tree(6);
        t.left.right = new Tree(2);
        t.left.left = new Tree(1);

        Tree.print2D(t);

        Tree.print2D(mirrorTree(t));

    }


    public static Tree mirrorTree(Tree t) {


        if(t==null) {
            return null;
        }
        Tree right = t.right;
        Tree left = t.left;

        if(t.left != null && t.right != null) {
            t.left = right;
            t.right = left;
        }

        if(t.left == null && t.right != null) {
            t.right = null;
            t.left = right;
        }

        if(t.right == null && t.left != null) {
            t.left = null;
            t.right = left;
        }

        if(t.left!=null) mirrorTree(t.left);
        if(t.right!=null) mirrorTree(t.right);

        return t;

    }
}
