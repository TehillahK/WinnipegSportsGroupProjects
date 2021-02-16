package DataTypes;

public class List {
    private Node top;
    public List()
    {
        top=null;
    }

}

class Node{
    private Data data;
    private Node next;
    public Node(Data data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    public Node getNext()
    {
        return next;
    }
}
