public class App3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print("FizzBuzz\t");
                } else {
                    System.out.print("fizz\t");
                }
            } else if (i % 5 == 0) {
                System.out.print("Buzz\t");
            } else {
                System.out.print(i + "\t");
            }
        }

    }
}
