import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        // Bậc nhất 1 ẩn
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a== 0) {
            if (b==0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println(" VÔ số nghiệm x");
            }
        } else {
            System.out.println("Kết quả x = " + (-b/a));
        }
        System.out.println();
        sc.close();
    }
}
