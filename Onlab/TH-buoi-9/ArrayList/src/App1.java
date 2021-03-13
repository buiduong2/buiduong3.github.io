import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i <= 100; i += 2) {
            arr2.add(i);
        }
        System.out.println(arr2);

        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            arr3.add(i);
        }
        for (int i = 2; i <= 50; i++) {
            for (int j = i * 2; j <= arr3.get(arr3.size() - 1); j += i) {
                if (arr3.indexOf(j) != -1) {
                    arr3.remove(arr3.indexOf(j));
                }
            }
        }
        System.out.println(arr3);
    }
}
