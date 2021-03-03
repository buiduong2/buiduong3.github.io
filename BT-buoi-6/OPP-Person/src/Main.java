import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hãy điền số lượng Sinh viên muốn nhập: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ : " + (i + 1));
            students[i] = new Student();
            students[i].input();
        }

        System.out.printf("\n\n%-5s\t %-15s %-10s %-15s %-15s %-12s %-15s\n", 
            "Mã SV", "Tên", "Giới tính", "Địa Chỉ", 
            "Ngày/Tháng/Năm Sinh", "Điểm TB", "Email");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
        sc.close();
    }
}
