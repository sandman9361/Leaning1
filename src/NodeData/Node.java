package NodeData;
/*
链表
 */
public class Node {  //保存数据的节点
    private String data;    //当前节点保存的数据
    private Node next;     //下一个节点
    public Node(String data){
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
    public void addNode(Node newNode){
        if(this.next == null){
            this.next = newNode;
        }else{
            this.next.addNode(newNode);
        }
    }
    public void printNode(){
        System.out.println(this.data);
        if(this.next != null){
            this.next.printNode();
        }
    }
}
