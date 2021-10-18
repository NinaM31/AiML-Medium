public class BTree<T> {
    private Node<T> root;

    public int countNodes(){
        return countNodes(root);
    }
    private int countNodes(Node<T> node){
        int count = 1;
        // Base case
        if( node == null ) return 0;
        else{
            // Recursive case and some process
            count += countNodes(node.left);
            count += countNodes(node.right);
            return count; 
        }
    }
    public boolean search(T data){
        return search(root, data);
    }
    private boolean search(Node<T> current, T data){
        // Base case
        if( current.data == data) return true;

        if(current.left != null)
            if(search(current.left, data)) return true;

        if(current.right != null)
            if(search(current.right, data)) return true;
        
        return false;
    }
    public Node<T> getRoot(){
        return root;
    }
    public void setRoot(Node<T> root){
        this.root = root;
    }
    public boolean empty(){
        return root == null;
    }
    public void printPreOrder(){
        if(empty()) return;
        root.preOrder(root);
    }
    public void printPostOrder(){
        if(empty()) return;
        root.postOrder(root);
    }
    public void printInOrder(){
        if(empty()) return;
        root.inOrder(root);
    }
}
