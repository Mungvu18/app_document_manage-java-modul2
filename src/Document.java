public class Document {
    private String code;
    private String producer;
    private String releaseAmount;

    public Document(String code, String producer, String releaseAmount) {
        this.code = code;
        this.producer = producer;
        this.releaseAmount = releaseAmount;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Document{" +
                "code='" + code + '\'' +
                ", producer='" + producer + '\'' +
                ", release='" + releaseAmount + '\'' ;
    }
}
