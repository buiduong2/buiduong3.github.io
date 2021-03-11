import java.util.Scanner;

public class PhoneManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng số điện thoại muốn thêm: ");
        int n = sc.nextInt();
        PhoneBook[] phones = new PhoneBook[20];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số điện thoại thứ: " + (i + 1));
            phones[i] = new PhoneBook();
            phones[i].input();
        }
        PhoneBook.sort(phones, n);

        System.out.println("Các số điện thoại vừa nhập là : ");
        printPhonesBook(phones, n);

        System.out.println("\nThêm số điện thoại: ");
        n = PhoneBook.addNumber(phones, n);
        printPhonesBook(phones, n);

        System.out.print("\nNhập vị trí muốn xoá số điện thoại: ");
        int index = sc.nextInt();
        n = PhoneBook.deleteNumber(phones, n, index);
        printPhonesBook(phones, n);

        System.out.print("\nNhập số id muốn tìm kiếm: ");
        int id = sc.nextInt();
        System.out.println("Vị trí cần tìm là : " + PhoneBook.searchId(phones, n, id));
        sc.nextLine();

        System.out.println("\nNhập vào tên tên số điện thoại muốn thay đổi: ");
        String name = sc.nextLine();
        edit(phones, name, n, sc);
        printPhonesBook(phones, n);

        sc.close();
    }

    static void edit(PhoneBook[] phones, String name, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            if (name.equals(phones[i].getName())) {
                System.out.println("Nhập vào số điện thoại mới: ");
                String newPhone = sc.nextLine();
                phones[i].setPhoneNumber(newPhone);
            }
        }
    }

    static void printPhonesBook(PhoneBook[] phones, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(phones[i].toString());
        }
    }

}
