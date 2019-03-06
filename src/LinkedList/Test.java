package LinkedList;

public class Test {
    public static void main(String args[]){
        Link data = new Link();
        data.add("hello");
        data.add("world");
        data.add("edison");
        data.add(null);
        System.out.println(data.lindSize());
    }
}
