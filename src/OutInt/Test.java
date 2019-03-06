package OutInt;

class Out {
    private static String msg = "hello world!";
    static class print{
        public static void p(){
            System.out.println(msg);
        }
    }
}
 public class Test{
    public static void main(String args[]){
      Out.print in = new Out.print();
      in.p();
    }
}
