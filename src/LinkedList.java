/**
 * Created by alandwiprasetyo on 16/06/16.
 */
public class LinkedList {
    Elemen first;
    
    //constructor
    public LinkedList(){
        this.first = null;
    }
    
    public void insertFirst(String title, String author){
        Elemen element = new Elemen(title,author);
        element.next = this.first;
        this.first = element;
    }
    
    public void insertLast(String title, String author){
      Elemen _elemen = new Elemen(title,author);
      if(first == null){
          this.first = _elemen;
      }else{
          Elemen last = this.first; //which will move the pointer to find the last element
          while(last.next != null){
              last = last.next;
          }
          last.next = _elemen;
      }
    }
    
    public void insertAt(String title, String author, String _el){
        Elemen _elemen = new Elemen(title,author);
        if(first == null){
            this.first = _elemen;
        }else{
            Elemen pointer = first; //pointer that will move to find an element that contains information in the form of _el
            while(pointer.next != null){
                if(pointer.info.title.equals(_el)){
                    _elemen.next = pointer.next;
                    pointer.next = _elemen;
                }
                pointer = pointer.next;
            }
        }
    }
    
    
    public void deleteFirst(){
        if(first == null) System.out.println("List is already Empty");
        else first = first.next;
    }
    
    public void deleteLast(){
        if(first == null){
            System.out.println("List is already Empty");
        }else{
            Elemen last = first; //which will move the pointer to find the last element
            Elemen befLast = null; // pointer that will be the element before the last element
            while(last.next != null){
                befLast = last;
                last = last.next;
            }
            befLast.next = null;
        }
    }
    
    public void deleteAt(String _el){
        if(first == null){
            System.out.println("List is already Empty");
        }else{
            Elemen pointer = first; // pointer that will move to find an element with information _el
            Elemen bef_el = null; // pointer that will be on the element before the element pointer
            while(pointer.next != null){
                bef_el = pointer;
                pointer = pointer.next;
                if(pointer.info.title.equals(_el)){
                    bef_el.next = pointer.next;
                }
            }
        }
        
    }
    
    public void print(){
        Elemen element = first;
        if(element == null) System.out.println("List is Empty");
        else{
            while(element != null){
                System.out.println(element.info.title +" - "+element.info.author);
                element = element.next;
            }
        }
    }
    
}
