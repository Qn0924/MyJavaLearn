public class Test1 {
    private static int id;

    public static void main(String[] args) {
        Test1 test=null;
        for (int i = 0; i < 10; i++) {
            test=new Test1();
            test.id++;
        }
        System.out.println(test.id);
    }
}
