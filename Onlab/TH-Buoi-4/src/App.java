import java.util.Scanner;

public class App {
    /**
     * Bài toán tìm tổng số các chữ số 1 số bất kỳ;
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int soDu = 0;
        while (n > 0) {
            soDu = n % 10;
            System.out.println("n: " + n);
            System.out.println("Số dư : " + soDu);
            sum += soDu;
            n /= 10;
        }
        System.out.println("Tổng các số nguyên vừa nhập là: " + sum);
        sc.close();
    }
}
