/**
 * קובץ: Queue.java
 * הגדרת מחלקת תור גנרית
 */


 // 
/**
 * -----------------------------------------
 * 1. מהו תור? (הגדרה פורמלית)
 * מבנה נתונים ליניארי מופשט המנהל אוסף של איברים. 
 * העיקרון: FIFO - First In, First Out. 
 * מי שנכנס ראשון (הוותיק ביותר) הוא הראשון לצאת.
 * * 2. למה לא להשתמש פשוט במערך? (היתרון המרכזי)
 * - במערך, אם נמחק את האיבר הראשון (במקום ה-0), נצטרך להזיז את כל 
 * שאר האיברים צעד אחד קדימה. זה לוקח המון זמן במערכים גדולים.
 * - בתור (מימוש משורשר), הוצאת איבר מהראש היא פעולה מידית (1)O 
 * כי רק משנים את המצביע (ה-Head).
 * * 3. איך זה נראה בזיכרון? (מימוש באמצעות חוליות - Nodes)
 * התור לא שמור ב"בלוק" אחד בזיכרון כמו מערך, אלא כשרשרת של חוליות.
 * - כל חוליה מכירה את הערך שלה ואת החוליה הבאה אחריה.
 * - התור עצמו מחזיק רק שני "עוגנים":
 **/

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }
   
    // הכנסת איבר לסוף התור
    public void insert(T x) {
        Node<T> temp = new Node<T>(x);
        if (head == null) {
            head = temp;
        } else {
            tail.setNext(temp);
        }
        tail = temp;
    }
   
    public T remove() {
        T x = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return x;
    }

    // הצצה לאיבר הראשון
    public T head() {
        return head.getValue();
    }

    // בדיקה אם התור ריק
    public boolean isEmpty() {
        return head == null;
    }

     @Override
    public String toString() {
        String s = "[";
        Node<T> p = head;
        while (p != null) {
            s += p.getValue() + (p.getNext() != null ? "," : "");
            p = p.getNext();
        }
        return s + "]";
    }
}