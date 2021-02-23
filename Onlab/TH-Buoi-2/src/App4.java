import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 tháng bất kỳ ");
        int month = sc.nextInt();
        sc.close();
        // default để kiểm tra điều kiện chứ ko nên tạo ra 1 cái if để kiểm tra điều kiện
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng này có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 30 ngày");
                break;
            default:
                System.out.println("Thông tin nhập vào không chính xác");
        }
    }
}
