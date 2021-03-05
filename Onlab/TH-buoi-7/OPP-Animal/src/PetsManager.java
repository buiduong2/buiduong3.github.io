import java.util.Scanner;

public class PetsManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng pets muôn nhập: ");
        int n = sc.nextInt();
        Pets[] pets = new Pets[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào thông tin pet thứ: " + (i + 1));
            pets[i] = new Pets();
            pets[i].input();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pets[i].toString());
        }

        pets[0].eat("fish");
        System.out.println(pets[0].run(300));

        sc.close();
    }
}
