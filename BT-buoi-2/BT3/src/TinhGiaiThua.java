import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy điền vào 1 số nguyên dương n: ");
        int n = sc.nextInt();
        int result =1;
        if (n <= 0) {
            System.out.println("Giá trị nhập vào không chính xác");
        } else {
            for (int i = 1; i <= n; i++) {
                result *=i;
            }
            System.out.printf("%d! = %d",n,result);
        }
        sc.close();
        System.out.println();
    }
}
