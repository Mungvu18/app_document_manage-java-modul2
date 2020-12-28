public class Journal extends Document {
    private String release;
    private String monthOfRelease;

    public Journal(String code, String producer, String releaseAmount, String release, String monthOfRelease) {
        super(code, producer, releaseAmount);
        this.release = release;
        this.monthOfRelease = monthOfRelease;
    }

    public String journalToString() {
        return super.toString() + " release= '" + release +'\'' + " monthOfRelease= '" + monthOfRelease + '\''+"}";
    }
}
