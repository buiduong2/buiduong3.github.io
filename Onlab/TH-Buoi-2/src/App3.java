import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        double detal = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Giá trị nhập vào không đúng");
        } else { // nên để else cho 1 cái thì nó mới tối ưu
            if (detal == 0) {
                System.out.println("Phương trình có  nghiệm: x= " + (-b / (2 * a)));
            } else if (detal > 0) {
                System.out.println("Phương trình có 2 nghiệm \nx1= " + ((-b + Math.sqrt(detal)) / (2 * a)) + "\nx2 = "
                        + ((-b - Math.sqrt(detal)) / (2 * a)));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        sc.close();
    }
}
