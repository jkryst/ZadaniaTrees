public class zadTreeIsMorphic {

    public static void main(String[] args) {

        Tree t1 = new Tree(5);
        t1.right = new Tree(4);
        t1.right.right = new Tree(7);
        t1.right.left = new Tree(0);

        t1.left = new Tree(6);
        t1.left.right = new Tree(2);
        t1.left.left = new Tree(1);

        Tree.print2D(t1);

        Tree t2 = new Tree(8);
        t2.right = new Tree(2);
        t2.right.right = new Tree(1);
        t2.right.left = new Tree(9);

        t2.left = new Tree(7);
        t2.left.right = new Tree(3);
        t2.left.left = new Tree(6);

        Tree.print2D(t2);

        System.out.println(isMorphicV2(t1, t2));

    }

    public static boolean isMorphic(Tree t1, Tree t2) {

        if(t1==null || t2==null) {
            return false;
        }

        if(t1.left!=null && t2.left == null) {
            return false;
        }

        if(t1.right!=null && t2.right == null) {
            return false;
        }

        if(t1.left==null && t2.left != null) {
            return false;
        }

        if(t1.right ==null && t2.right != null) {
            return false;
        }

        isMorphic(t1.right, t2.right);
        isMorphic(t1.left, t2.left);

        return true;

    }

    public static boolean isMorphicV2(Tree t1, Tree t2 ){

        if(t1==null && t2==null) return true;

        if(t1==null || t2==null) return false;

        return (isMorphicV2(t1.left, t2.left)&& isMorphicV2(t1.right, t2.right));

    }
}
