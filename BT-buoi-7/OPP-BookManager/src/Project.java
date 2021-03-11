public class Project extends Book implements IKho {
    private int numberOfPages;
    private boolean status;
    private int yearOfProtection;

    public Project() {

    }

    public Project(String id, String name, String publisher, int publishingYear, int amount, int numberOfPages,
            boolean status, int yearOfProtection) {
        super(id, name, publisher, publishingYear, amount);
        this.numberOfPages = numberOfPages;
        this.status = status;
        this.yearOfProtection = yearOfProtection;
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

    public int getYearOfProtection() {
        return yearOfProtection;
    }

    public void setYearOfProtection(int yearOfProtection) {
        this.yearOfProtection = yearOfProtection;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập vào số trang: ");
        numberOfPages = Integer.valueOf(sc.nextLine());

        System.out.print("Nhập vào tình trạng: True | False : ");
        status = Boolean.valueOf(sc.nextLine());

        System.out.print("Nhập vào năm bảo vệ: ");
        yearOfProtection = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Pages: " + numberOfPages + "\nStatus: " + status
                + "\nYear of protection: " + yearOfProtection;
    }

    @Override
    public String getLocation(String location) {
        return location;
    }
}
