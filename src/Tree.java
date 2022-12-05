

public class Tree {

    static final int COUNT = 10;
    int value;
    Tree left;
    Tree right;

    Tree(int value) {
        this.value = value;
        right = null;
        left = null;
    }


    public void insert(Tree t, int value) {
        if (value < t.value) { if (t.left != null)
        { insert(t.left, value);
        } else {
            System.out.println(" Inserted " + value + " to left of " + t.value);
            t.left = new Tree(value); } } else if (value > t.value)

            {
            if (t.right != null) {
                insert(t.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + t.value);
                t.right = new Tree(value);
            }
        }
    }

    static void print2DUtil(Tree root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    static void print2D(Tree root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }




}
