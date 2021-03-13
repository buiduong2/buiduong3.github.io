import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String[] pathNames = { "SchoolBook.txt", "GraduationThesis.txt", "ElectronicDocuments.txt" };
        for (String pathName : pathNames) {
            System.out.println("\n" + pathName);
            File myFile = new File(pathName);
            if (!myFile.exists()) {
                System.out.println("Đường dẫn ko chính xác,Kết thúc chương trình ");
                System.exit(0);
            }
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
            myReader.close();
        }
    }
}
