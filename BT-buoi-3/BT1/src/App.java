import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Điền vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Điền vào phần tử thứ " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("In mảng");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // tìm max1 và max 2;
        int max1 = arr[0];
        int location1 = 0;
        for (int i = 0; i < n; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
                location1 = i;
            }
        }
        int max2 = (arr[0] == max1) ? arr[1] : arr[0];
        int location2 = (0 == location1) ? 1 : 0;
        for (int i = 0; i < n; i++) {
            if (max2 < arr[i] && arr[i] != max1) {
                max2 = arr[i];
                location2 = i;
            }
        }
        System.out.println("Giá trị lớn nhất: " + max1 + " -vị trí i: " + location1);
        System.out.println("Giá trị lớn nhì: " + max2 + " -vị trí i: " + location2);
        // Sắp xếp mảng
        System.out.println();
        System.out.println("Sắp xếp mảng theo thứ tự giảm dần");
        int swarp;
        sc.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    swarp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swarp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Sau khi sắp xếp
        // Phần tử lớn nhất là arr[0] ; i=0;
        // phẩn tử lớn thứ 2 là arr[1] ; i=1;
        System.out.println();
    }
}
