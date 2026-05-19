public class Store {
    private Node<Game> lst;

    public Store(Node<Game> lst) {
        this.lst = lst;
    }

    public Node<Game> getLst() {
        return lst;
    }

    public int remove(int n, int pr){
        int count = 0;
        while(lst.getValue().getPrice() == pr && n != count && lst != null){
            count++;
            lst = lst.getNext();
        }
        if(lst == null || n == count){
            return count;
        }
        Node<Game> temp = lst;
        while(n != count && temp.getNext() != null){
            if(temp.getNext().getValue().getPrice() == pr){
                count++;
                temp.setNext(temp.getNext().getNext());
            } else {
                temp = temp.getNext();
            }
        }
        return count;
    }

