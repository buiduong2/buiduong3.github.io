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
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Theoretical point: " + theoreticalPoint);
        System.out.println("Practice point: " + practicePoint);
        System.out.println("Gpa: " + getGpa());
    }
}