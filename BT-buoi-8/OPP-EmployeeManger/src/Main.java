import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Employee> listEmployee = new ArrayList<>();

        int n = 0;
        do {
            Employee employee = new Employee();
            employee.input();
            listEmployee.add(employee);
            System.out.print("\nNhập số bất kỳ để tiếp tục | Nhập 0 để dừng lại : ");
            n = Integer.valueOf(sc.nextLine());
        } while (n != 0);
        print(listEmployee);

        System.out.println("\nChương trình chèn 1 nhân viên mới vào vị trí 0 -> " + listEmployee.size() + " : ");
        System.out.print("Nhập vào vị trí cần chèn: ");
        n = Integer.valueOf(sc.nextLine());
        insert(listEmployee, n);
        print(listEmployee);

        System.out.println("\nChương trình xoá nhân viên : ");
        delete(listEmployee);
        print(listEmployee);

        System.out.println("\nChương trình sửa tên nhân viên : ");
        editName(listEmployee);
        print(listEmployee);

        sc.close();

        File myFile = new File("NhanVien.txt");
        myFile.createNewFile();
        System.out.println("\nFile created: " + myFile.getAbsolutePath());
        FileWriter myWriter = new FileWriter("NhanVien.txt");
        for (Employee employee : listEmployee) {
            myWriter.write(employee + "\n");
        }
        myWriter.close();
    }

    static void print(ArrayList<Employee> listEmployee) {
        System.out.println("\nDanh sách nhân viên: ");
        for (Employee e : listEmployee) {
            System.out.println(e);
        }
    }

    static void insert(ArrayList<Employee> listEmployee, int n) {
        if (n < 0) {
            System.out.println("Thông tin nhập vào không chính xác");
            return;
        } else if (n > listEmployee.size()) {
            System.out.println("Tiến hành chèn vào cuối danh sách nhân viên: ");
            n = listEmployee.size();
        }
        Employee employee = new Employee();
        employee.input();
        listEmployee.add(n, employee);
    }

    static void delete(ArrayList<Employee> listEmployee) {
        int i = search(listEmployee);
        if (i == -1) {
            return;
        }
        listEmployee.remove(listEmployee.get(i));
    }

    static void editName(ArrayList<Employee> listEmployee) {
        int i = search(listEmployee);
        if (i == -1) {
            return;
        }
        System.out.print("Nhập tên mới của nhân viên: ");
        listEmployee.get(i).setName(sc.nextLine());
    }

    static int search(ArrayList<Employee> listEmployee) {
        System.out.print("Nhập 1 - tìm NV theo tên | 2 - tìm NV theo ID:  ");
        int n = Integer.valueOf(sc.nextLine());
        System.out.print("Hãy điền từ khoá tương ứng: ");
        String key = sc.nextLine();
        if (n == 1) {
            for (int i = 0; i < listEmployee.size(); i++) {
                if (listEmployee.get(i).getName().equals(key)) {
                    return i;
                }
            }
        } else if (n == 2) {
            for (int i = 0; i < listEmployee.size(); i++) {
                if (listEmployee.get(i).getId().equals(key)) {
                    return i;
                }
            }
        }
        System.out.println("Thông tin nhập vào không chính xác");
        return -1;
    }

}
