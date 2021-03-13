import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("D:\\1-Hoc\\WEB\\4-My-Project\\buiduong3.github.io\\Onlab\\TH-buoi-9\\File\\123.txt");
        Scanner sc = new Scanner(myFile);
        System.out.println(sc.nextLine());

        // Sử kiểm tra hàm sau khi in thì có chữ khác ko;
        System.out.println(sc.hasNext());
        sc.close();
    }
}
