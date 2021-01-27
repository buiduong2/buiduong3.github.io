import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn hãy điền vào 1 số nguyên bất kỳ: ");
        int number = sc.nextInt();
        String result = number % 2 == 0 ? "là số chẵn" : "là số lẻ";
        System.out.printf("Số \"%d\" là số %s", number, result);
        sc.close();
    }
}
