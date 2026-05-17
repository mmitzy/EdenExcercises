/**
 * מחלקת חוליה (Node)
 * משמשת כיחידת הבסיס לבניית מבני נתונים
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    // בנאי המקבל ערך
    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    // בנאי המקבל ערך וחוליה להמשך
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    // החזרת הערך של החוליה
    public T getValue() {
        return value;
    }
    
    // עדכון הערך של החוליה
    public void setValue(T value) {
        this.value = value;
    }

    // החזרת החוליה הבאה
    public Node<T> getNext() {
        return next;
    }

    // עדכון החוליה הבאה
    public void setNext(Node<T> next) {
        this.next = next;
    }
  
    // בדיקה האם קיימת חוליה באה
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}