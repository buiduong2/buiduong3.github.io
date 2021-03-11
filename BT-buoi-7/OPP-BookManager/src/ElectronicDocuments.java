public class ElectronicDocuments extends Book implements IDownload {
    private double capacity;
    private int downloads;
    private double price;

    public ElectronicDocuments() {

    }

    public ElectronicDocuments(String id, String name, String publisher, int publishingYear, int amount,
            double capacity, int downloads, double price) {
        super(id, name, publisher, publishingYear, amount);
        this.capacity = capacity;
        this.downloads = downloads;
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập vào dung lượng: ");
        capacity = Double.valueOf(sc.nextLine());

        System.out.print("Nhập vào số lượt tải: ");
        downloads = Integer.valueOf(sc.nextLine());

        System.out.print("Nhập vào giá thành: ");
        price = Double.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacity: " + capacity + "\nDownloads: " + downloads + "\nPrice: " + price;
    }

    @Override
    public double getTotalPrice() {
        return downloads * price;
    }
}