import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập vào số hàng= số cột của 2 ma trận: ");
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        // Điền giá trị
        System.out.println("Điền giá trị của ma trận 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Hãy điền giá trị của arr1[%d][%d]: ", i, j);
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Hãy điền giá trị của ma trận 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Hãy điền giá trị của arr2[%d][%d]: ", i, j);
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();
        // Tổng 2 ma trận
        int[][] sumOfArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumOfArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        // in ma trận
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("Ma trận 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Ma trận 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("Tổng 2 ma trận");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumOfArr[i][j] + "\t");
            }
            System.out.println();
        }
        // tìm mà trận chuyển vị
        System.out.println("------------------------------");
        int[][] arr_1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr_1[i][j] = arr1[j][i];
            }
        }
        int[][] arr_2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr_2[i][j] = arr2[j][i];
            }
        }
        // in ma trận chuyển vị
        System.out.println();
        System.out.println("Ma trận chuyển vị  1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr_1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Ma trận chuyển vị  2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr_2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
