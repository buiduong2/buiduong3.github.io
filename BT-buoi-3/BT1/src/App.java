import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Điền vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Hãy điền giá trị của arr[%d]: ", i);
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.println("Dữ liệu nhập vào không chính xác");
                System.exit(0);
            }
        }
        sc.close();

        System.out.println("\nIn mảng");
        displayArray(arr, n);

        // tìm max1 và max 2;
        // max1
        int maxIndex1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[maxIndex1] < arr[i]) {
                maxIndex1 = i;
            }
        }

        System.out.println("\n\nVị trí phần tử lớn nhất là: ");
        getIndex(arr, n, arr[maxIndex1]);

        // max 2
        int max2 = -1;
        for (int i = 0; i < n; i++) {
            if (max2 < arr[i] && arr[i] != arr[maxIndex1]) {
                max2 = arr[i];
            }
        }
        if (max2 == -1) {
            System.out.println("\n\nKhông tồn tại phần tử lớn thứ 2");
        } else {
            System.out.println("\n\nVị trí phần tử lớn thứ 2 là: ");
            getIndex(arr, n, max2);
        }

        // Sắp xếp mảng
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\n\nSắp xếp mảng theo thứ tự giảm dần");
        displayArray(arr, n);

    }

    // Xuất mảng
    public static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // Tìm vị trí lớn nhất + lớn nhì
    public static void getIndex(int[] arr, int n, int max) {
        System.out.println("-Giá trị: " + max);
        for (int i = 0; i < n; i++) {
            if (max == arr[i]) {
                System.out.println("-Vị trí có giá trị tương ứng: " + i);
            }
        }
    }
}
