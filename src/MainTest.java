import java.util.Scanner;

public class MainTest {
    public static final String ENTER_CODE = "nhập code";
    public static final String MENU = "Menu: ";
    public static final String ADD_DOCUMENT = "1. thêm tài liệu ";
    public static final String DISPLAY_ALL = "2. Hiển thị toàn bộ tài liệu ";
    public static final String FIND_BY_CODE = "3. Tìm kiếm theo code ";
    public static final String EXIT = "0. Exit ";
    public static final String ENTER_CHOICE = "Mời bạn nhập choice";
    public static final String ENTER_PRODUC = "Nhập nhà sản xuất";
    public static final String ENTER_RELEASEAMOUNT = "Nhập số lượng bản phát hành";
    public static final String RELEASE = "Bản phát hành";
    public static final String ENTER_AUTHOR = "Tên tác già";
    public static final String ENTER_AMOUNT_PAGE = "Số trang";
    public static final String RELEASE_DAY = "Ngày phát hành";
    public static final String MONTH_RELEASE = "Tháng phát hành";
    public static final String ENTER_KIND_OF_DOCUMENT = "Mời bạn nhập kiểu document là [Book,Newspaper,Journal]";
    public static final String BOOK = "Book";
    public static final String JOURNAL = "journal";
    public static final String NEWSPAPER = "Newspaper";
    public static final String SOID_NUUN = "--------------------------------------------------------------------------";
    static DocumentManage documentManage = new DocumentManage();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập n");
                    int number = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewDocument();
                    }
                    break;
                case 2:
                    documentManage.showAll();
                    break;
                case 3:
                    System.out.println(ENTER_CODE);
                    String code = sc.nextLine();
                    documentManage.findByCode(code);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println(MENU);
        System.out.println(ADD_DOCUMENT);
        System.out.println(DISPLAY_ALL);
        System.out.println(FIND_BY_CODE);
        System.out.println(EXIT);
        System.out.println(ENTER_CHOICE);
    }

    public static void addNewDocument() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println(ENTER_CODE);
        String code = sc1.nextLine();
        System.out.println(ENTER_PRODUC);
        String producer = sc.nextLine();
        System.out.println(ENTER_RELEASEAMOUNT);
        String releaseAmount = sc1.nextLine();
        String kindOfDocument = "";
        boolean testBook;
        boolean testNewspaper;
        boolean testJournal;
        do {
            System.out.println(ENTER_KIND_OF_DOCUMENT);
            kindOfDocument = sc.nextLine();
            if (kindOfDocument.equalsIgnoreCase(BOOK)) {
                System.out.println(ENTER_AUTHOR);
                String author = sc1.nextLine();
                System.out.println(ENTER_AMOUNT_PAGE);
                int amountPage = Integer.parseInt(sc.nextLine());
                Document book = new Book(code, producer, releaseAmount, author, amountPage);
                documentManage.addNew(book, code);
            } else if (kindOfDocument.equalsIgnoreCase(JOURNAL)) {
                System.out.println(RELEASE);
                String release = sc1.nextLine();
                System.out.println(MONTH_RELEASE);
                String monthOfRelease = sc1.nextLine();
                Document journal = new Journal(code, producer, releaseAmount, release, monthOfRelease);
                documentManage.addNew(journal, code);
            } else if (kindOfDocument.equalsIgnoreCase(NEWSPAPER)) {
                System.out.println(RELEASE_DAY);
                String releaseDay = sc.nextLine();
                Document newspaper = new Newspaper(code, producer, releaseAmount, releaseDay);
                documentManage.addNew(newspaper, code);
            }
            testBook = kindOfDocument.equalsIgnoreCase(BOOK);
            testNewspaper = kindOfDocument.equalsIgnoreCase(NEWSPAPER);
            testJournal = kindOfDocument.equalsIgnoreCase(JOURNAL);
        } while (!testBook && !testJournal && !testNewspaper);
        System.out.println(SOID_NUUN);
    }
}
