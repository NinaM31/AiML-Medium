public class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data){
        this.data = data;
        left = null;
        right = null;
    }
      // (Root, left, Right)
      public void preOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        // Print Root
        System.out.print(node.data + " ");

        // Recursive Case
        preOrder(node.left); // Left
        preOrder(node.right); // Right
    }

    // (Left, Right, Root)
    public void postOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        //Recursive case
        postOrder(node.left); // Left
        postOrder(node.right); // Right

        // print root
        System.out.print(node.data + " ");
    }

    // (Left, Root, Right)
    public void inOrder(Node<T> node){
        // Base Case
        if( node == null ) return;

        //Recursive case and print
        inOrder(node.left); // Left
        System.out.print(node.data + " "); // print root
        inOrder(node.right); // Right
    }
}
