import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("audi");
        cars.add("Mazada");
        System.out.println(cars); // Có thể in trực tiếp
        for (String s : cars) {
            System.out.print(s + " ");
        }

        // Gợi tới length;
        System.out.println(cars.size());

        // Truy xuất phần tử;
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));

        // Sửa phần tử
        cars.set(0, "Oto");
        System.out.println(cars);

        // Xoá hết phần tử
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars);

        // Xoá phần tử
        cars.add("Volvo");
        cars.add("audi");
        cars.add("Mazada");
        cars.remove(0);
        System.out.println(cars);
        cars.remove("audi");
        System.out.println(cars);

        // Chèn 1 ArrayList khác
        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("ford");
        System.out.println(cars);
        cars2.addAll(cars);
        System.out.println(cars2);

        // Ngoài ra có thể nối vào vị trí số 2
        cars2.addAll(0, cars);
        System.out.println(cars2);

        // Xoá phần tử không thuojc cars cũ
        cars2.retainAll(cars); // Trả về các phần tử của cars
        System.out.println(cars2);

        // ArrayList với Integer

    }
}
