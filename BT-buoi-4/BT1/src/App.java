public class App {
    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.id = 1;
        sv1.fullName = "Nguyễn Văn A";
        sv1.theoreticalPoint = 8.5f;
        sv1.practicePoint = 7.2f;
        sv1.display();

        Student sv2 = new Student();
        sv2.id = 2;
        sv2.fullName = "Nguyễn Thị B";
        sv2.theoreticalPoint = 5f;
        sv2.practicePoint = 11.2f;
        sv2.display();

        Student sv3 = new Student();
        sv3.id = 3;
        sv3.fullName = "Thị Nguyễn Ab";
        sv3.theoreticalPoint = -1;
        sv3.practicePoint = 8;
        sv3.display();

        Student sv4 = new Student(4, "Bùi Dương", 8.2f, 6.2f);
        sv4.display();
        
        //Kiểm tra method tính điểm trung bình;
        System.out.printf("\n\nĐiểm trung bình của %s : %.2f",sv1.fullName,sv1.getGpa());
        System.out.printf("\nĐiểm trung bình của %s : %.2f",sv2.fullName,sv2.getGpa());
        System.out.printf("\nĐiểm trung bình của %s : %.2f",sv3.fullName,sv3.getGpa());
        System.out.printf("\nĐiểm trung bình của %s : %.2f\n",sv4.fullName,sv4.getGpa());
    }
}
