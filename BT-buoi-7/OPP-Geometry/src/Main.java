import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng hình học muốn nhập: ");
        int n = sc.nextInt();
        Geometry[] geometry = new Geometry[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập 1 - để khởi tạo hình tròn | 2 - để khởi tạo hình chữ nhật: ");
            switch (sc.nextInt()) {
            case 1:
                geometry[i] = new Circle();
                nhapDuLieu((Circle) geometry[i], sc);
                break;
            case 2:
                geometry[i] = new Rectangle();
                nhapDuLieu((Rectangle) geometry[i], sc);
                break;
            default:
                System.out.println("Dữ liệu nhập vào không chính xác");
                System.exit(0);
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            geometry[i].display();
        }
        sc.close();
    }

    static void nhapDuLieu(Circle circle, Scanner sc) {
        System.out.println("Điền vào bán kính hình tròn: ");
        circle.setRadius(sc.nextDouble());

    }

    static void nhapDuLieu(Rectangle rectangle, Scanner sc) {
        System.out.print("Nhập vào chiều dài hcn: ");
        rectangle.setLength(sc.nextDouble());
        System.out.print("Nhập vào chiều rộng hcn: ");
        rectangle.setWidth(sc.nextDouble());
    }
}
