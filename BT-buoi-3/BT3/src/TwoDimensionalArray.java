import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy điền vào số hàng của Array: ");
        int row = sc.nextInt();
        System.out.print("Hãy điền vào số cột của Array: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Hãy điền giá trị của arr1[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // in mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        // tính tổng % 5==0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 5 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổn các phần tử chia hết cho 5 là : " + sum);
        // Cái này em thấy có thể gộp vào với thằng vòng lặp in mảng nhưng nghe đâu đấy
        // là ko nên làm thế ạ để nó tối ưu;
    }
}
