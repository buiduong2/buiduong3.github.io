import java.util.Scanner;

public class MutilDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn hãy điền vào số chiều của Array (2-3): ");
        int dimensional = sc.nextInt();
        System.out.print("Hãy điền vào số hàng của Array: ");
        int row = sc.nextInt();
        System.out.print("Hãy điền vào số cột của Array: ");
        int col = sc.nextInt();
        int z = 1;
        if (dimensional == 3) {
            System.out.print("Hãy điền số lớp z của mảng: ");
            z = sc.nextInt();
        } else {
            System.out.println("Khởi tạo mảng 2 chiều ");
        }
        int[][][] arr = new int[z][row][col];
        for (int k = 0; k < z; k++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.printf("Hãy điền giá trị của arr1[%d][%d][%d]: ", k, i, j);
                    arr[k][i][j] = sc.nextInt();
                }
            }
        }
        sc.close();
        // in mảng
        if (z == 1) {
            // Có thể dùng phần code của else để in ra mảng 2 chiều luôn.
            // mảng 2 chiều sau khi khởi tạo là twoDimensionalArray
            int[][] twoDimensionalArray = arr[0];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(twoDimensionalArray[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            for (int k = 0; k < z; k++) {
                System.out.println("mảng con thứ " + k);
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(arr[k][i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        int sum = 0;
        // tính tổng % 5==0;
        for (int k = 0; k < z; k++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (arr[k][i][j] % 5 == 0) {
                        sum += arr[k][i][j];
                    }
                }
            }
        }
        System.out.println("Tổng các phần tử chia hết cho 5 là : " + sum);
        // Cái này em thấy có thể gộp vào với thằng vòng lặp in mảng nhưng nghe đâu đấy
        // là ko nên làm thế ạ để nó tối ưu;

    }
}
