package LinkedList;

public class Link {     //链表类，外部只能通过Link使用链表数据
    /*
    在Link类中加入内部类Node（保存数据、数据的交换 ）
     */
    private class Node{         //定义节点类
        private String data;    //保存数据
        private Node next;      //引用关系
        public Node(String data){
            this.data = data;
        }
        public void addNode(Node newNode){
            if(this.next == null){      //当前节点为空
                this.next = newNode;
            }else{
                this.next.addNode(newNode);
            }
        }
    }
    private Node root;  //链表根节点
    private int count = 0;
    public void add(String data){
        if(data == null){
            return;
        }
         Node newNode = new Node(data);   //要保存到节点的数据
        if(this.root == null){
            this.root = newNode;
        }else{
            this.root.addNode(newNode);
        }
        this.count ++;
    }
    public int lindSize(){
        return count;
    }
}
