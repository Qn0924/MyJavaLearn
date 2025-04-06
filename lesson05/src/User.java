public class User {
    public static int num;
    static {
        num++;
        System.out.println("执行静态代码块");
    }
}
