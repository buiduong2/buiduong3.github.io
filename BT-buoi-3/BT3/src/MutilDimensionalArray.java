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
            System.out.println("\nKhởi tạo mảng 2 chiều ");
        }
        int[][][] arr = new int[z][row][col];
        for (int k = 0; k < z; k++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.printf("Hãy điền giá trị của arr[%d][%d][%d]: ", k, i, j);
                    arr[k][i][j] = sc.nextInt();
                }
            }
        }
        sc.close();

        // in mảng
        System.out.println("\n\nIn mảng thu được: ");
        if (z == 1) {
            int[][] twoDimensionalArray = arr[0];
            displayTwoDimensinalArray(twoDimensionalArray, row, col);
        } else {
            displayThreeDimensinalArray(arr, z, row, col);
        }

        // tính tổng % 5==0;
        int sum = 0;
        for (int k = 0; k < z; k++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (arr[k][i][j] % 5 == 0) {
                        sum += arr[k][i][j];
                    }
                }
            }
        }
        System.out.println("\n\nTổng các phần tử chia hết cho 5 là : " + sum);
    }

    // Phương thức xuất mảng 2 chiều
    public static void displayTwoDimensinalArray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // phương thức xuất mảng 3 chiều
    public static void displayThreeDimensinalArray(int[][][] arr, int z, int row, int col) {
        for (int k = 0; k < z; k++) {
            System.out.println();
            displayTwoDimensinalArray(arr[k], row, col);
        }
    }
}
