
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DocumentManage {
    public static final String NOT_EXITS = "Not exits";
    Map<String,Document> listDocuments = new TreeMap<>();
    Set<String> listKeys = listDocuments.keySet();
    public void addNew(Document document, String code){
        listDocuments.put(code,document);
    }
    public void showAll(){
        for (String key: listKeys) {
            Document document = listDocuments.get(key);
            if (document instanceof Book) {
                Book book = (Book) document;
                System.out.println(book.bookToString());
            } else if (document instanceof Newspaper){
                Newspaper newspaper = (Newspaper) document;
                System.out.println(newspaper.NewspaperToString());
            } else if(document instanceof Journal){
                Journal journal = (Journal) document;
                System.out.println(journal.journalToString());
            }

        }
    }
    public void findByCode(String code){
        boolean testCode = false;
        for (String key: listKeys) {
            Document document = listDocuments.get(key);
            testCode = document.getCode().equalsIgnoreCase(code);
            if (testCode){
                System.out.println(document);
                return;
            }
        }
        if(!testCode){
            System.out.println(NOT_EXITS);
        }
    }
}
