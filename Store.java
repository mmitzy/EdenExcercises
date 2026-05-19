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
       while(lst != null && count != n && lst.getValue().getPrice() == pr){
        lst = lst.getNext();
        count++;
       }
       Node<Game> temp = lst;
       while(count != n && temp.getNext() != null){
        if(temp.getNext().getValue().getPrice() == pr){
            count++;
            temp.setNext(temp.getNext().getNext());
        }
        temp = temp.getNext();
       }
       return count;
    }

    public int removeCheap(int num){
        int gamesSum = 0;
        int currentMin = lst.getValue().getPrice();
        Node<Game> temp = lst;
        while(num != 0){
            while(temp != null){
                if(currentMin > temp.getValue().getPrice()){
                    currentMin = temp.getValue().getPrice();
                }
                temp = temp.getNext();
            }
            temp = lst;
            int numRemoved = remove(num, currentMin);
            num -= numRemoved;
            gamesSum =+ numRemoved * currentMin;
            currentMin = lst.getValue().getPrice();
        }
        return gamesSum;
    }
}