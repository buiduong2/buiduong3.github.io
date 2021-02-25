import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    private static final int DECEMBER = 12;
    private static final int NOVEMBER = 11;
    private static final int OCTOBER = 10;
    private static final int SEPTEMBER = 9;
    private static final int AUGUST = 8;
    private static final int JULY = 7;
    private static final int JUNE = 6;
    private static final int MAY = 5;
    private static final int APRIL = 4;
    private static final int MARCH = 3;
    private static final int FEBRUARY = 2;
    private static final int JANUARY = 1;

    public static void main(String[] args) throws Exception {
        Date date = new Date(); // lấy ngày hiện tại;

        // Tạo đối tượng SimpleDateFormat
        SimpleDateFormat fDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // SimpleDateFormat có phương thức nhận vào Date chuyển sang String;
        String currentDate = fDateFormat.format(date);
        System.out.println(currentDate);

        // Shorthand;
        String currentDate1 = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        System.out.println(currentDate1);
        int month = (int) (Math.random() * 12);
        
        switch (month) {
            case JANUARY:
                System.out.println("Đây là tháng JANUARY");
                break;
            case FEBRUARY:
                System.out.println("Đây là tháng FEBRUARY");
                break;
            case MARCH:
                System.out.println("Đây là tháng MARCH");
                break;
            case APRIL:
                System.out.println("Đây là tháng APRIL");
                break;
            case MAY:
                System.out.println("Đây là tháng MAY");
                break;
            case JUNE:
                System.out.println("Đây là tháng JUNE");
                break;
            case JULY:
                System.out.println("Đây là tháng JULY");
                break;
            case AUGUST:
                System.out.println("Đây là tháng AUGUST");
                break;
            case SEPTEMBER:
                System.out.println("Đây là tháng SEPTEMBER");
                break;
            case OCTOBER:
                System.out.println("Đây là tháng OCTOBER");
                break;
            case NOVEMBER:
                System.out.println("Đây là tháng NOVEMBER");
                break;
            case DECEMBER:
                System.out.println("Đây là tháng DECEMBER");
                break;
        }
    }
}
