import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn hãy điền bán kính của đường tròn: ");
        double radius = sc.nextDouble();
        double circlePremeter = radius * 2 * Math.PI;
        double circleArea = radius * radius * Math.PI;
        System.out.printf("Bán Kính của hình tròn là: %.2f\nDiện tích của hình tròn là: %.2f\n", circlePremeter,
                circleArea);
        sc.close();
    }
}
