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
            System.out.print("\nNhập 0 - Sử dụng các chương trình khác | Số bất kỳ để tiếp tục thêm nhân viên : ");
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
        Employee employee = search(listEmployee);
        if (employee.getName() == null) {
            return;
        }
        listEmployee.remove(employee);
    }

    static void editName(ArrayList<Employee> listEmployee) {
        Employee employee = search(listEmployee);
        if (employee.getName() == null) {
            return;
        }
        System.out.print("Nhập tên mới của nhân viên: ");
        employee.setName(sc.nextLine());
    }

    static Employee search(ArrayList<Employee> listEmployee) {
        System.out.print("Nhập 1 - tìm NV theo tên | 2 - tìm NV theo ID:  ");
        int n = Integer.valueOf(sc.nextLine());
        System.out.print("Hãy điền từ khoá tương ứng: ");
        String key = sc.nextLine();
        if (n == 1) {
            for (Employee e : listEmployee) {
                if (e.getName().equals(key)) {
                    return e;
                }
            }
        } else if (n == 2) {
            for (Employee e : listEmployee) {
                if (e.getId().equals(key)) {
                    return e;
                }
            }
        }
        System.out.println("Thông tin nhập vào không chính xác");
        Employee employee = new Employee();
        return employee;
    }

}
