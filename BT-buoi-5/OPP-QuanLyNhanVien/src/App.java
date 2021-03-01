import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên : ");
        int n = sc.nextInt();
        NhanVien[] nv = new NhanVien[1];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập 1 để nhập Lập Trình viên   |   Nhập 2 để nhập Kiểm Chứng Viên : ");
            int choose = sc.nextInt();
            if (choose == 1) {
                nv[i] = new LapTrinhVien();
            } else if (choose == 2) {
                nv[i] = new KiemChungVien();
            } else {
                System.out.println("Dữ liệu nhập vào ko chính xác");
                System.exit(0);
            }
            nv[i].input();
        }
        for (int i = 0; i < n; i++) {
            nv[i].display();
        }
        sc.close();
    }
}
