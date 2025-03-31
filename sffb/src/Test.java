import java.util.Scanner;

public class  Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 1;
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                sum -= 1;
            } else if (c == '*') {
                sum *= 2;
            }
            if (sum >= 2025) {
                found = true;
                break;
            }
        }
    if(found){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}