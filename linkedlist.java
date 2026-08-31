class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class linkedlist {
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
    }
    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }
    static void delete(int pos){
        if(head == null){
            return;
        }
        if(pos == 1){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos - 1; i++){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        delete(2);
        display();
    }
}
