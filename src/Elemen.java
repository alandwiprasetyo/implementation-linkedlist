/**
 * Created by alandwiprasetyo on 16/06/16.
 */
public class Elemen {
    Info info;
    Elemen next;
    
    public Elemen(String title, String author){
        this.info = new Info(title,author);
        this.next = null;
    }
    
}
