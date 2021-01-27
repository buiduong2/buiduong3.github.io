import java.util.Scanner;

public class IsTriangular {
    public static void main(String[] args) {
        // BT 1 Kiểm tra xem có phải là 3 cạnh của 1 tam giác
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy điền vào độ dài cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Hãy điền vào độ dài cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Hãy điền vào độ dài cạnh c: ");
        double c = sc.nextDouble();
        if((a <=0 || b <=0 || c<=0) || (a+b <= c || c + a <= b || b+ c <= a)) {
            System.out.println("Đây không phải là 3 cạnh của 1 tam giác");
        } else {
            System.out.println("Đây là 3 cạnh của 1 tam giác");
        }
       sc.close();
    }
}
