import java.util.Scanner;

public class Book {
    private String id;
    private String name;
    private String publisher;
    private int publishingYear;
    private int amount;
    protected Scanner sc = new Scanner(System.in);

    public Book() {

    }

    public Book(String id, String name, String publisher, int publishingYear, int amount) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void input() {
        System.out.print("Nhập vào mã sách: ");
        id = sc.next();
        sc.nextLine();

        System.out.print("Nhập vào tên sách: ");
        name = sc.nextLine();

        System.out.print("Nhập vào nhà xuất bản: ");
        publisher = sc.nextLine();

        System.out.print("Nhập vào năm xuất bản: ");
        publishingYear = Integer.valueOf(sc.nextLine());

        System.out.print("Nhập vào số lượng: ");
        amount = Integer.valueOf(sc.nextLine());
    }

    public String toString() {
        return "\nId: " + id + "\nName: " + name + "\nPublisher: " + publisher + "\nPublishing year: " + publishingYear
                + "\nAmount: " + amount;
    }
}
