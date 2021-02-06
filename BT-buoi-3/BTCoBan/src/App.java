import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n phẩn từ của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // nhập giá trị
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị arr[%d] :", i);
            arr[i] = sc.nextInt();
        }
        sc.close();
        // in mảng
        System.out.println("\n----------------------\n");
        System.out.println("In mảng vừa nhập ra màn hình: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        int max = arr[0];
        int min = arr[0];
        int evenCount = 0;
        // tìm max min
        System.out.println("\n----------------------\n");
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] % 2 == 0) {
                evenCount++;
                System.out.printf("\narr[%d]= %d là số chẵn", i, arr[i]);
            }
        }
        // in kết quả max min evenCount;
        System.out.println("\n----------------------\n");
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
        System.out.println("Số lượng số chẵn là: " + evenCount);
        // tìm số nguyên tố
        System.out.println("\n----------------------\n");
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(arr[i])) {
                System.out.printf("\nSố nguyên tố là arr[%d] = %d", i, arr[i]);
            }
        }
        // sắp xếp tăng
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n----------------------\n");
        System.out.println("In mảng tăng dần");
        displayArray(arr, n);

        // sắp xếp giảm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n----------------------\n");
        System.out.println("In mảng giảm dần");
        displayArray(arr, n);
    }

    // Xác định số nguyên
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // in mảng
    public static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
