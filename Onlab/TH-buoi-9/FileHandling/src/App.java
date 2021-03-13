import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File myFile = new File("D:\\1-Hoc\\WEB\\4-My-Project\\buiduong3.github.io\\Onlab\\TH-buoi-9\\File\\123.txt");
        myFile.createNewFile(); // Trả về boolean;

        // Ghi Văn bản vào trong tệp;
        /**
         * Mỗi lần chạy chương trình lại new file thì nó sẽ lại như mới;
         */
        FileWriter fileWrite = new FileWriter(
                "D:\\1-Hoc\\WEB\\4-My-Project\\buiduong3.github.io\\Onlab\\TH-buoi-9\\File\\123.txt");
        fileWrite.write("Tiet hoc thu 9 ");
        fileWrite.write("Tiet hoc thu 10 ");
        // file lại như mới
        // Sử dụng append;
        fileWrite.append("123");
        fileWrite.close();
        Scanner sc = new Scanner(myFile);
        System.out.println(sc.nextLine());
        sc.close();
    }
}
