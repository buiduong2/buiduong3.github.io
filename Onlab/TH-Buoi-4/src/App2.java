import java.util.Scanner;
import java.util.StringTokenizer;

public class App2 {
    // đếm số từ dựa vào dấu cách;
    /**
     * Hàm tách string thành các substring :
     * 
     * StringTokenizer stringTokenizer = new StringTokenizer(s,"Đừa vào phân biệt");
     * . Ko đua thì mặc định là dấu cách.
     * 
     * .countTokens Đếm số lượng ký tự
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        System.out.println(stringTokenizer.countTokens());
        sc.close();
    }
}
