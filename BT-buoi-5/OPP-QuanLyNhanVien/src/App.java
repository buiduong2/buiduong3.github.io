import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LapTrinhVien ltv1 = new LapTrinhVien();
        LapTrinhVien ltv2 = new LapTrinhVien();
        LapTrinhVien ltv3 = new LapTrinhVien(123, "Lập Trình Viên 3", 10, "0123456789", "email@gmail.com", 15000, 0);
        KiemChungVien ktv1 = new KiemChungVien();
        KiemChungVien ktv2 = new KiemChungVien();
        KiemChungVien ktv3 = new KiemChungVien(456, "Kiểm Chứng Viên 3", 5, "19001008", "email@email.com", 10000, 3);

        nhapDuLieu(ltv1, sc);
        nhapDuLieu(ltv2, sc);
        nhapDuLieu(ktv1, sc);
        nhapDuLieu(ktv2, sc);

        System.out.printf("\n\n%s\t %-15s %-2s\t %-10s \t%-20s %s\t\t%s   %s ", "Mã nv", "Họ tên", "Tuổi", "SĐT", "Email",
                "Lương CB", "overtime", "Lương");
        ltv1.display();
        ltv2.display();
        ltv3.display();

        System.out.printf("\n\n%-3s\t %-15s %-2s\t %-10s \t%-20s %s\t\t%s   %s ", "Mã nv", "Họ tên", "Tuổi", "SĐT",
                "Email", "Lương CB", "P.Hiện lỗi", "Lương");
        ktv1.display();
        ktv2.display();
        ktv3.display();

        sc.close();
    }

    static void nhapDuLieu(LapTrinhVien ltv, Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        ltv.setId(Integer.valueOf(sc.nextLine()));

        System.out.print("Nhập họ tên LTV: ");
        ltv.setName(sc.nextLine());

        System.out.print("Nhập vào tuổi của LTV: ");
        ltv.setAge(sc.nextInt());

        System.out.print("Nhập vào số điện thoại của LTV: ");
        ltv.setPhoneNumber(sc.next());

        System.out.print("Nhập vào email của LTV: ");
        ltv.setEmail(sc.next());

        System.out.print("Nhập vào lương cơ bản của LTV: ");
        ltv.setBasicSalary(sc.nextDouble());
        sc.nextLine();

        System.out.print("Nhập vào số giờ overtime của LTV: ");
        ltv.setOvertimeHours(sc.nextDouble());
        sc.nextLine();
    }

    static void nhapDuLieu(KiemChungVien ktv, Scanner sc) {
        System.out.print("Nhập mã nhân viên: ");
        ktv.setId(Integer.valueOf(sc.nextLine()));

        System.out.print("Nhập họ tên KTV: ");
        ktv.setName(sc.nextLine());

        System.out.print("Nhập vào tuổi của KTV: ");
        ktv.setAge(sc.nextInt());

        System.out.print("Nhập vào số điện thoại của KTV: ");
        ktv.setPhoneNumber(sc.next());

        System.out.print("Nhập vào email của KTV: ");
        ktv.setEmail(sc.next());

        System.out.print("Nhập vào lương cơ bản của KTV: ");
        ktv.setBasicSalary(sc.nextDouble());
        sc.nextLine();

        System.out.print("Nhập vào số lỗi phát hiện của KTV: ");
        ktv.setNumberOfErrorsDetected(sc.nextInt());
        sc.nextLine();
    }
}
