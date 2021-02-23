public class App6 {
    public static void main(String[] args) {
        int tong=0;
        for(int i= 0 ; i<= 10; i++) {
            if (i%2==0) {
                System.out.println(i);
                tong+=i;
            }
        }
        System.out.println(tong);
    }
}
