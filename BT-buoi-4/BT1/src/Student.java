public class Student {
    public int id;
    public String name;
    public float theoreticalPoint;
    public float practicePoint;

    public Student() {

    }

    public Student(int id, String name, float theoreticalPoint, float practicePoint) {
        this.id = id;
        this.name = name;
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public float getGpa() {
        if (practicePoint >= 0 && practicePoint <= 10 && theoreticalPoint >= 0 && theoreticalPoint <= 10) {
            return (practicePoint + theoreticalPoint) / 2;
        } else {
            //Hàm trả về kết quả khi điểm nhập vào không hợp lệ;
            return -1;
        }
    }

    public void display() {
        System.out.printf("%3d\t %-15s %8.2f %10.2f %10.2f \n", id, name, theoreticalPoint, practicePoint, getGpa());
    }
}