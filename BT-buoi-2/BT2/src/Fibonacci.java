import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /**
         * Bài 2: 2 Viết chương trình cho phép nhập vào một số nguyên dương n, liệt kê n
         * số Fibonacci đầu tiên.
         */
        // đọc hiểu sai yêu cầu đề bài. Đề yêu cầu liệt kê n số chứ ko phải các số sau
        // chữ n
        // thay vì dùng if có thể cộng thẳng số sau vào số trước như thế thì luôn đúng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên Dương bất kỳ");
        int n = sc.nextInt();
        int number = 1;
        int previousNumber = 0;
        int nextNumber;
        if (n < 0) {
            System.out.println("Giá trị nhập vào không chính xác");
        } else {
            if (n == 1) {
                System.out.println("Dãy số cần tìm là: " + previousNumber);
            } else if (n == 2) {
                System.out.println("Dãy số cần tìm là: 0, 1");
            } else {
                System.out.println("Dãy số cần tìm là: ");
                System.out.print(previousNumber + ", " + number);
                for (int i = 1; i <= n - 2; i++) {
                    nextNumber = previousNumber + number;
                    previousNumber = number;
                    number = nextNumber;
                    System.out.print(", " + nextNumber);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
