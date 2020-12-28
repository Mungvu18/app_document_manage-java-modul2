public class Book extends Document{
    private String author;
    private int amountPage;
    public Book(String code, String producer, String releaseAmount, String author, int amountPage) {
        super(code, producer, releaseAmount);
        this.amountPage = amountPage;
        this.author = author;
    }

    public String bookToString() {
        return super.toString() + " author= '" + author +'\'' + " amountPage= '" +amountPage+'\''+"}";
    }
}
