public class isBSTzad {

    static Tree prev;

    public static void main(String[] args) {

        Tree t1 = new Tree(5);
        t1.right = new Tree(8);
        t1.right.right = new Tree(9);
        t1.right.left = new Tree(6);

        t1.left = new Tree(3);
        t1.left.right = new Tree(3);
        t1.left.left = new Tree(2);

        Tree.print2D(t1);
        System.out.println(isBST(t1));
    }



//    public static boolean isBST(Tree t) {
//
//            Tree root = t;
//            Tree left = t.left;
//            Tree right = t.right;
//
//
//            if (left<root &&
//                left.left<left &&
//                left.right>=left && left.right<root &&
//                right>=root &&
//                right.left < right && right.left >= root) {
//
//
//
//                }
//
//
//
//    }


    static boolean isBST(Tree t){
        if (t!= null){

            if (!isBST(t.left)) {return false;}

            if (prev != null && t.value <= prev.value) {return false;}

            prev = t;

            return isBST(t.right);

        } return true;
    }
}
