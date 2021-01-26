import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 1 Tính chu vi và diện tích của hình tròn với bán kính r nhập vào từ bàn phím
        System.out.println("Bài 1: Tính diện tích & bán kính đường tròn ");
        System.out.print("Bạn hãy điền bán kính của đường tròn: ");
        double radius = sc.nextInt();
        double circlePremeter = radius * 2 * Math.PI;
        double circleArea = radius * radius * Math.PI;
        System.out.printf("Bán Kính của hình tròn là: %.2f\nDiện tích của hình tròn là: %.2f\n", circlePremeter,
                circleArea);

        System.out.println("\n\n\n\n\n");
        // 2 Nhập vào 1 số bất kỳ và kiểu tra xem số là số chẵn hay số lẻ (Sử dụng toán
        // tử điều kiện)
        System.out.println("Bài 2: Kiểm tra chẵn lẻ");
        System.out.print("Bạn hãy điền vào 1 số nguyên bất kỳ: ");
        int number = sc.nextInt();
        String result = number % 2 == 0 ? "là số chẵn" : "là số lẻ";
        result = number <= 0 ? "không phải số chẵn cũng không phải là số lẻ" : result;
        System.out.printf("Số \"%d\" là số %s", number, result);
        sc.close();
        System.out.println("\n\n\n\n\n");
        // 3 Tính tiền lãi hàng tháng của khoản vay
        System.out.println("Bài 3: Tính lãi hàng tháng của khoản vay");
        double debt = 100000000;
        double yearRate = 0.12;
        double monthRate = yearRate / 12;
        double earnings = debt * monthRate;
        double totalEarnings = debt / 12 + earnings;
        System.out.printf("Số nợ của bạn là: %.2f \n", debt);
        System.out.println("Lãi xuất năm bạn là: " + (int) (yearRate * 100) + "%");
        System.out.printf("Lãi xuất hàng tháng của bạn là: %.2f \n", monthRate);
        System.out.printf("Tiền lãi trả hàng tháng của bạn là: %.2f \n", earnings);
        System.out.printf("Tổng số tiền phải trả hàng tháng của bạn là: %.2f \n", totalEarnings);

    }
}
