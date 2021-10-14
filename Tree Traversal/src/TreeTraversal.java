public class TreeTraversal {
    public static void main(String[] args) throws Exception {
        //Alphabet Tree
        Node<Integer> root = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        Node<Integer> node6 = new Node<Integer>(6);
        Node<Integer> node7 = new Node<Integer>(7);
        Node<Integer> node8 = new Node<Integer>(8);
        
        root.setLeft(node2);
        root.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);
        node3.setRight(node7);

        node4.setLeft(node8);

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
        System.out.print(node.getData() + " ");

        // Recursive Case
        preOrder(node.getLeft()); // Left
        preOrder(node.getRight()); // Right
    }

    // (Left, Right, Root)
    public static<T> void postOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        //Recursive case
        postOrder(node.getLeft()); // Left
        postOrder(node.getRight()); // Right

        // print root
        System.out.print(node.getData() + " ");
    }

    // (Left, Root, Right)
    public static<T> void inOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        //Recursive case and print
        inOrder(node.getLeft()); // Left
        System.out.print(node.getData() + " "); // print root
        inOrder(node.getRight()); // Right
    }
}
