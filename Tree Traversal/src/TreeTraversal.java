public class TreeTraversal {
    public static void main(String[] args) throws Exception {
        // Simplified  way to add data: BTree
        Node<Integer> root = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        Node<Integer> node6 = new Node<Integer>(6);
        Node<Integer> node7 = new Node<Integer>(7);
        Node<Integer> node8 = new Node<Integer>(8);
        
        root.left = node2;
        root.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node4.left = node8;

        System.out.print("Pre-Order: ");
        preOrder(root);

        System.out.println();

        System.out.print("Post-Order: ");
        postOrder(root);

        System.out.println();

        System.out.print("In-Order: ");
        inOrder(root);
    }

    // (Root, left, Right)
    public static<T> void preOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        // Print Root
        System.out.print(node.data + " ");

        // Recursive Case
        preOrder(node.left); // Left
        preOrder(node.right); // Right
    }

    // (Left, Right, Root)
    public static<T> void postOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        //Recursive case
        postOrder(node.left); // Left
        postOrder(node.right); // Right

        // print root
        System.out.print(node.data + " ");
    }

    // (Left, Root, Right)
    public static<T> void inOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        //Recursive case and print
        inOrder(node.left); // Left
        System.out.print(node.data + " "); // print root
        inOrder(node.right); // Right
    }
}
