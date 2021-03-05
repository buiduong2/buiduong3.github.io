public class PhoneBook extends Phone {
    private int id;

    public PhoneBook() {
    }

    public PhoneBook(int id, String name, String phoneNumber) {
        super(name, phoneNumber);
        this.id = id;
    }

    @Override
    public void input() {
        System.out.print("Nhập vào số id: ");
        id = Integer.valueOf(sc.nextLine());
        super.input();
    }

    @Override
    public String toString() {
        return "Id : " + id + "\t" + super.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static void sort(PhoneBook[] phones, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (phones[i].getId() > phones[j].getId()) {
                    PhoneBook temp = phones[i];
                    phones[i] = phones[j];
                    phones[j] = temp;
                }
            }
        }
    }

    static int addNumber(PhoneBook[] phones, int n) {
        if (n + 1 > 20) {
            return n;
        }
        phones[n] = new PhoneBook();
        phones[n].input();

        int index = n - 1;
        while (phones[n].getId() < phones[index].getId()) {
            index--;
        }
        PhoneBook temp = phones[n];
        for (int i = n; i > index + 1; i--) {
            phones[i] = phones[i - 1];
        }
        phones[index + 1] = temp;
        return n + 1;
    }

    static int deleteNumber(PhoneBook[] phones, int n, int index) {
        if (n == 0) {
            return n;
        }
        for (int i = index + 1; i < n; i++) {
            phones[i - 1] = phones[i];
        }
        return n - 1;
    }

    static int searchId(PhoneBook[] phones, int n, int id) {
        int l = 0;
        int r = n - 1;
        while (phones[l].getId() != phones[r].getId() && phones[l].getId() <= id && phones[r].getId() >= id) {
            int mid = l + (r - l) * (id - phones[l].getId()) / (phones[r].getId() - phones[l].getId());

            if (phones[mid].getId() < id) {
                r = mid - 1;
            } else if (phones[mid].getId() > id) {
                l = mid + 1;
            } else {
                if (mid - 1 > 0 && phones[mid - 1].getId() == mid) {
                    r = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        if (phones[l].getId() == id) {
            return l;
        }
        return -1;
    }
}
