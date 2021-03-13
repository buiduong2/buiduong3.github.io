import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * - Thông tin trong các file Yêu cầu em đã điền sẵn để phục vụ cho việc kiểm
     * tra chương trình đọc file ạ;
     * 
     * - Chương trình đọc file ở trong file ReadFile.java ạ ^^;
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String n;

        // Nhập thông tin sách giáo khoa
        ArrayList<Book> schoolBooks = new ArrayList<>();
        System.out.println("Nhập thông tin sách giáo khoa: ");
        do {
            Book book = new SchoolBook();
            book.input();
            schoolBooks.add(book);
            System.out.print("\nTiếp tục thêm sách ? (y/n) : ");
            n = sc.nextLine();
        } while (n.equals("y"));

        // Nhập thông tin đồ án
        System.out.println("\nNhập thông tin đồ án: ");
        ArrayList<Book> graduationThesis = new ArrayList<>();
        do {
            Book book = new GraduationThesis();
            book.input();
            graduationThesis.add(book);
            System.out.print("\nTiếp tục thêm sách ? (y/n) : ");
            n = sc.nextLine();
        } while (n.equals("y"));

        // Nhập thông tin sách điện tử;
        System.out.println("\nNhập thông tin tài liệu điện tử: ");
        ArrayList<Book> electronicDocuments = new ArrayList<>();
        do {
            Book book = new ElectronicDocuments();
            book.input();
            electronicDocuments.add(book);
            System.out.print("\nTiếp tục thêm sách ? (y/n) : ");
            n = sc.nextLine();
        } while (n.equals("y"));

        sc.close();

        // Lưu thông tin file SchoolBook;
        luuThongTin(schoolBooks, "SchoolBook.txt");

        // Lưu thông tin file GraduationThesis;
        luuThongTin(graduationThesis, "GraduationThesis.txt");

        // Lưu thông tin file ElectronicDocuments;
        luuThongTin(electronicDocuments, "ElectronicDocuments.txt");
    }

    static void luuThongTin(ArrayList<Book> books, String path) throws IOException {
        File myFile = new File(path);
        myFile.createNewFile();
        System.out.println("\nFile Created: " + myFile.getAbsolutePath());
        FileWriter myFileWriter = new FileWriter(path);
        for (Book book : books) {
            myFileWriter.write(book + "\n");
        }
        myFileWriter.close();
    }
}
