import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu" + i);
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        int swap;
        for (int i = 0; i < n / 2; i++) {
            swap = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = swap;
        }
        System.out.println("Xắp xếp mảng theo thứ tự ngược lại");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i =0 ; i< n-1; i++) {
            for (int j =i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        System.out.println("\nSap xep mang");
        for(int i =0; i< n; i++){ 
            System.out.print( arr[i] +" ");
        }
        sc.close();
        System.out.println();
        System.out.println("Gia tri nho nhat");
        System.out.println(min);
        System.out.println("Gia tri lon nhat");
        System.out.println(max);
    }
}