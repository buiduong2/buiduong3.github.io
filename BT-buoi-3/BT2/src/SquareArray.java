import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập vào số hàng ,số cột của 2 ma trận vuông: ");
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];

        System.out.println("\n\nĐiền giá trị của ma trận 1");
        setArray(arr1, n);

        System.out.println("\n\nHãy điền giá trị của ma trận 2");
        setArray(arr2, n);
        
        sc.close();

        // Tổng 2 ma trận
        int[][] sumOfArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumOfArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("\n\nMa trận 1");
        displayArray(arr1, n);

        System.out.println("\n\nMa trận 2");
        displayArray(arr2, n);

        System.out.println("\n\nTổng 2 ma trận");
        displayArray(sumOfArr, n);


        System.out.println("\n\nMa trận chuyển vị  1");
        transpose(arr1, n);
        displayArray(arr1, n);

        System.out.println("\n\nMa trận chuyển vị  2");
        transpose(arr2, n);
        displayArray(arr2, n);
    }

    // Nhập ma trận
    public static void setArray(int[][] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Hãy điền giá trị của arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // in ma trận
    public static void displayArray(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // tìm ma trận chuyển vị
    public static void transpose(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
