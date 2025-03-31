public class Eggs {
    public static void main(String[] args) {
        int[] []arr=new int[3][6];
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j]=(i+1)*(j+1);
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
