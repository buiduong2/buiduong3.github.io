import java.util.Scanner;

public class App4 {
    private static final int DECEMBER = 12;
    private static final int NOVEMBER = 11;
    private static final int OCTOBOR = 10;
    private static final int SEPTEMBER = 9;
    private static final int AUGUST = 8;
    private static final int JULY = 7;
    private static final int JUNE = 6;
    private static final int MAY = 5;
    private static final int APRIL = 4;
    private static final int MARCH = 3;
    private static final int FEBRUARY = 2;
    private static final int JANUARAY = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 tháng bất kỳ ");
        int month = sc.nextInt();
        sc.close();
        // default để kiểm tra điều kiện chứ ko nên tạo ra 1 cái if để kiểm tra điều
        // kiện
        switch (month) {
            case JANUARAY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBOR:
            case DECEMBER:
                System.out.println("Tháng này có 31 ngày");
                break;
            case FEBRUARY:
                System.out.println("Tháng này có 28 hoặc 29 ngày");
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                System.out.println("Tháng này có 30 ngày");
                break;
            default:
                System.out.println("Thông tin nhập vào không chính xác");
        }
    }
}
