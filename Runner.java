class Node {
    public Node next;
    int data;
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node();
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node node=head;
        while(node.next!=null){
            System.out.println(node.data);
        }
        System.out.println(node.data);
    }

}
public class Runner{
    public static void main(String args[]){
        LinkedList obj = new LinkedList();
        obj.insert(3);
        obj.insert(4);
        obj.insert(7);
        obj.show();
    }
}