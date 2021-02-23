import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double bMI = weight / (height * height);
        sc.close();
        if (bMI < 18.5)
            System.out.println("Thiếu cân");
        else if (bMI <= 24.9)
            System.out.println("Cân đối");
        else
            System.out.println("Thừa cân");
    }
}
