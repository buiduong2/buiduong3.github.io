public class TextBook extends Book implements IMuon, IKho {
    private int numberOfPages;
    private boolean status;
    private int amountBorrowed;

    public TextBook() {

    }

    public TextBook(String id, String name, String publisher, int publishingYear, int amount, int numberOfPages,
            boolean status, int amountBorrowed) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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

        System.out.print("Nhập vào tình trạng: True | False : ");
        status = Boolean.valueOf(sc.nextLine());

        System.out.print("Nhập vào số lượng mượn: ");
        amountBorrowed = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Pages: " + numberOfPages + "\nStatus: " + status + "\nAmount borrowed: "
                + amountBorrowed;
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
