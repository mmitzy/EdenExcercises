public class Room {
    private int num;
    private Queue<User> users;
    private int[] arr;

    public Room(int num){
        this.num = num;
        this.users = new Queue<>();
    }

    public void addUser (User u){
        Queue<User> temp = new Queue<>();
        boolean flag = true;
        while (!this.users.isEmpty){
            if (this.users.head().getName() == u.getName())
                flag = false;
            temp.insert(this.users.remove());
        }
        while (!temp.isEmpty){
            this.users.insert(temp.remove());
        }
        if (flag == true)
            this.users.insert(u);
    }

}     