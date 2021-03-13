public class SchoolBook extends Book implements IBorrow, ILibrary {
    private int numberOfPages;
    private String status;
    private int amountBorrowed;

    public SchoolBook() {

    }

    public SchoolBook(String id, String name, String publisher, int publishingYear, int amount, int numberOfPages,
            String status, int amountBorrowed) {
        super(id, name, publisher, publishingYear, amount);
        this.numberOfPages = numberOfPages;
        this.status = status;
        this.amountBorrowed = amountBorrowed;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(int amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    @Override
    public void input() {
        super.input();

        System.out.print("Nhập vào số trang: ");
        numberOfPages = Integer.valueOf(sc.nextLine());

        System.out.print("Nhập vào tình trạng: ");
        status = sc.nextLine();

        System.out.print("Nhập vào số lượng mượn: ");
        amountBorrowed = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + " | " + numberOfPages + " | " + status + " | " + amountBorrowed;
    }

    @Override
    public int getInventory() {
        return getAmount() - getAmountBorrowed();
    }

    @Override
    public String getLocation(String location) {
        return location;
    }
}
