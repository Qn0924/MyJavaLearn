public class W {
    public static void main(String[] args) {

        W test1 = new W();

        System.out.println(test1.test(1,2,3));
    }
    public int test(int ... num){
        int sum=0;
        for (int i : num) {
            sum+=i;
        }
        return sum;
    }//你这能看清代码？？？？？能牛皮

}
