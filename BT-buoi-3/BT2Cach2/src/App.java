public class App {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        // Để cho các phần tử không bị gán lại giá trị ban đầu khi ij = ji (đến 1 lúc nào
        // đấy arr[i][j] lại chạy đến arr[i][j] với i và j đảo 2 lần)
        //VD  Khi i = 1 ; j =2; =>arr[1][2]  đổi vị trí  arr[2][1].
        // nhưng đến khi i=2 ; j=1 => lại bị đổi vị trí
        int swap;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i > j) {
                    j = i;
                }
                swap = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = swap;
            }
        }
        System.out.println("--------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
