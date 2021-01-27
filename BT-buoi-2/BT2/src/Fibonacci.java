import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /**
         * Bài 2: 2 Viết chương trình cho phép nhập vào một số nguyên dương n, liệt kê n
         * số Fibonacci đầu tiên.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên Dương bất kỳ");
        int n = sc.nextInt();
        int number = 1;
        int previousNumber = 1;
        if (n <= 0) {
            System.out.println("Giá trị nhập vào không chính xác");
        } else if (n >= 2) {
            System.out.println("Dãy số cần tìm là: ");
            System.out.print(previousNumber + ", " + number);
            for (int i = 1; i <= n; i++) {
                if (previousNumber + number == i) {
                    System.out.print(", " + i);
                    previousNumber = number;
                    number = i;
                }
            }
            System.out.println();
        } else {
            System.out.println("Dãy số cần tìm là: 1");
            // Em nghĩ mãi ko ra cách làm thế nào để chỉ điền 1 số 1 nếu n =1; nên giải
            // quyết theo hướng này. nếu n !=1 thì câu lệnh mãi mãi ko bao giờ chạy tới. Có
            // vẻ tối ưu :D
        }
        sc.close();
    }
}
