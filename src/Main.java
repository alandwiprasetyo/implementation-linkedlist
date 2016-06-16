/**
 * Created by alandwiprasetyo on 16/06/16.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("Harry Potter", "J. K. Rowling");
        list.insertLast("The Hobbit", "J. R. R. Tolkien");
        list.deleteAt("Harry Potter");
        list.print();
    }
    
}
