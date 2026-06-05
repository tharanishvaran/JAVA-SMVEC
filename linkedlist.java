class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class linkedlist {
    public static void main(String[] args) {
        // Your Code goes here!
        node first=new node(10);
        node second=new node(20);
        node third=new node(30);
        
        first.next=second;
        second.next=third;
        node temp=first;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
}