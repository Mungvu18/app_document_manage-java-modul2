public class Newspaper extends Document {
 private String releaseDay;

    public Newspaper(String code, String producer, String releaseAmount, String releaseDay) {
        super(code, producer, releaseAmount);
        this.releaseDay = releaseDay;
    }


    public String NewspaperToString() {
        return super.toString() + " releaseDay= '" + releaseDay +'\''+"}";
    }
}
