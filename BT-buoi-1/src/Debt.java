public class Debt {
    public static void main(String[] args) {
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
