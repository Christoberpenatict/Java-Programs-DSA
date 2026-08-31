 class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class circularll {
     static Node head = null;
    static void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    static void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }while(temp != null);
        System.out.println(" (back to head) ");
    }
     static void delete(int pos){
        if(head == null){
            return;
        }
        if(pos == 1){
            if(head.next == head){
                head = null;
                return;
            }
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
        }
            head = head.next;
            temp.next = head;
            return;
        }
        Node temp = head;
        for(int i = 0; i < pos - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        delete(4);
        display();
    }
}
