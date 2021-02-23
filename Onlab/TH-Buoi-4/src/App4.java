import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        if (n <= 0 || n > 20) {
            System.out.println("Giá trị nhập vào quá lớn hoặc quá nhỏ");
            System.exit(0);
        }
        int size = 20;
        int[] arr = new int[size];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        // Xuất mảng
        System.out.println("\n\nMảng sau khi nhập là: ");
        xuatMang(n, arr);

        // Thêm phần tử
        System.out.print("\n\nNhập phần tử muốn thêm: ");
        int x = sc.nextInt();
        n = insertToPop(arr, n, size, x);
        System.out.println("Mảng sau khi thêm là: ");
        xuatMang(n, arr);

        // Sửa phần tử
        // tạo phương thức Sửa phần tử là ko cần thiết. giết gà ko cần giao mổ trâu;
        System.out.print("\n\nNhập vị trí phần tử muốn sửa: ");
        int k = sc.nextInt();
        if (k < 0 || k >= n) {
            System.out.println("Vi tri khong hop le");
            System.exit(0);
        }
        System.out.println("Nhap phan tu: ");
        x = sc.nextInt();
        arr[k] = x;
        System.out.println("Mảng sau khi sửa là: ");
        xuatMang(n, arr);

        // Chén phần tử vào vị trí
        System.out.print("\n\nNhập vào  vị trí muốn chèn phần tử: ");
        k = sc.nextInt();
        System.out.print("Giá trị cần thêm vào là : ");
        x = sc.nextInt();
        n = insert(arr, n, k, x, size);
        System.out.println("Mảng sau chèn là: ");
        xuatMang(n, arr);

        // Xoá phần tử khỏi vị trí
        System.out.println("\n\nNhập vào  vị trí muốn xoá phần tử: ");
        k = sc.nextInt();
        n = delete(arr, n, k);
        System.out.println("Mảng sau xoá là: ");
        xuatMang(n, arr);
        sc.close();
    }

    static void xuatMang(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static int insertToPop(int[] arr, int n, int size, int x) {
        if (n >= size) {
            return n;
        }
        arr[n] = x;
        return n + 1;
    }

    static int insert(int[] arr, int n, int k, int num, int size) {
        if (n >= size) {
            return n;
        }
        if (k >= n || k < 0) {
            System.out.println("Nhập vào vị trí ko chính xác Không thể sửa phần tử ");
            return n;
        }
        for (int i = n; i > k; i--) {
            arr[i] = arr[i - 1];
        }
        arr[k] = num;
        return n + 1;
    }

    static int delete(int[] arr, int n, int k) {
        if (k >= n || k < 0) {
            System.out.println("Nhập vào vị trí ko chính xác Không thể sửa phần tử ");
            return n;
        }
        for (int i = k; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
}
