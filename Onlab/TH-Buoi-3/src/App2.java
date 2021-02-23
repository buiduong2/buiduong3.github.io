import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng và số cột");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phẩn tử " + i + " " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    if (min > arr[i][j]) {
                        min = arr[i][j];
                    }
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }
                }
            }
        }

        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // System.out.println("Nhập vào phẩn tử mâ trận 2 " + i + " " + j);
                // arr2[i][j] = sc.nextInt();
                arr2[i][j] = (int)(Math.random() * 10) ;
            }
        }
        System.out.println("Tổng Đường chéo chính là: " + sum);
        System.out.println("Max trên đường chéo chính là: " + max);
        System.out.println("min trên đường chéo chính là: " + min);
        System.out.println("ma trận  1 là");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("ma trận  2 là");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] arr3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("Tổng 2 ma trận là");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
