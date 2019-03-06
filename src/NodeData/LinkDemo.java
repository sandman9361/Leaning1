package NodeData;

public class LinkDemo {
    public static void main(String args[]){
        Node root = new Node("火车头");
        Node d1 = new Node("节点A");
        Node d2 = new Node("节点B");
        root.setNext(d1);
        d1.setNext(d2);
        print(root);
    }
    //使用递归获取链表中的数据
    public static void print(Node current){
        if(current == null){
            return;
        }
        System.out.println(current.getData());
        print(current.getNext());
    }
}
