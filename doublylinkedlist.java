 class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class doublylinkedlist {
    static Node head = null;
    static void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }
    static void delete(int pos){
        if(head == null){
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos; i++){
            temp = temp.next;
        }
        if(temp.prev != null){
            temp.prev.next = temp.next;
        }
        else{
            head = temp.next;
        }
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        delete(3);
        display();
    }
}
