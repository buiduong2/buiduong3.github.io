import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("..\\File\\Student.txt");
        if (myFile.exists()) {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
            myReader.close();
        } else {
            System.out.println("File does not exist");
        }
    }
}
