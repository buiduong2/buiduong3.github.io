public class GraduationThesis extends Book implements ILibrary {
    private int numberOfPages;
    private String status;
    private int yearOfProtection;

    public GraduationThesis() {

    }

    public GraduationThesis(String id, String name, String publisher, int publishingYear, int amount, int numberOfPages,
            String status, int yearOfProtection) {
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

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
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

        System.out.print("Nhập vào tình trạng: ");
        status = sc.nextLine();

        System.out.print("Nhập vào năm bảo vệ: ");
        yearOfProtection = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + " | " + numberOfPages + " | " + status + " | " + yearOfProtection;
    }

    @Override
    public String getLocation(String location) {
        return location;
    }
}
