package NodeData;

public class Link {
    private Node root;
    public void add(String data){
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        }else{
            this.root.addNode(newNode);
        }
    }
    public void print(){
        if(root != null){
            this.root.printNode();
        }
    }
}
