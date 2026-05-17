/**
 * מחלקה המייצגת צומת בעץ בינארי
 * T - סוג הנתון שנשמר בצומת (למשל Integer, String וכו')
 */ 

public class BinTreeNode<T> {
    private T value;
    private BinTreeNode<T> left;
    private BinTreeNode<T> right;

    // בנאי המקבל ערך בלבד (יוצר צומת ללא ילדים - עלה)
    public BinTreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // בנאי המקבל ערך ושני ילדים (שמאלי וימני)
    public BinTreeNode(BinTreeNode<T> left, T value, BinTreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    // החזרת הערך השמור בצומת
    public T getValue() {
        return value;
    }
    // עדכון הערך של הצומת
    public void setValue(T value) {
        this.value = value;
    }
    //   5
    // 3   7

    // החזרת הבן השמאלי
    public BinTreeNode<T> getLeft() {
        return left;
    }

    // עדכון הבן השמאלי
    public void setLeft(BinTreeNode<T> left) {
        this.left = left;
    }

    // החזרת הבן הימני
    public BinTreeNode<T> getRight() {
        return right;
    }

    // עדכון הבן הימני
    public void setRight(BinTreeNode<T> right) {
        this.right = right;
    }

    // בדיקה האם קיים בן שמאלי
    public boolean hasLeft() {
        return left != null;
    }

    // בדיקה האם קיים בן ימני
    public boolean hasRight() {
        return right != null;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}