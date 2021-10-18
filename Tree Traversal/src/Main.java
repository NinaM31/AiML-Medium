public class Main {
    public static void main(String[] args){
        BTree<Integer> tree = new BTree<Integer>();

        System.out.println("Nodes in empty tree");
        System.out.println(tree.countNodes());

        System.out.println("Adding values to tree");
        Node<Integer> root = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        Node<Integer> node6 = new Node<Integer>(6);
        Node<Integer> node7 = new Node<Integer>(7);
        Node<Integer> node8 = new Node<Integer>(8);

        tree.setRoot(root);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;

   
        System.out.println("Nodes after adding to tree");
        System.out.println(tree.countNodes());

        System.out.println("Search for value 4");
        System.out.println(tree.search(4));

        System.out.println("Pre-Order");
        tree.printPreOrder();

        System.out.println();

        System.out.println("Post-Order");
        tree.printPostOrder();

        System.out.println();

        System.out.println("In-Order");
        tree.printInOrder();
    }
}
