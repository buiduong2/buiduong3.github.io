import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số sách: ");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập thể loại sách muốn nhập: \n1-Sách giáo Khoa\t2-Đồ Án\t\t3-Tài liệu điện tử: ");
            switch (sc.nextInt()) {
            case 1:
                books[i] = new TextBook();
                break;
            case 2:
                books[i] = new Project();
                break;
            case 3:
                books[i] = new ElectronicDocuments();
                break;
            default:
                System.out.println("Dữ liệu nhập vào không chính xác: ");
                System.exit(0);
            }
            books[i].input();
        }

        System.out.println("\nDanh Sách tài liệu vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }
        sc.close();
    }
}
