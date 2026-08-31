class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MiddleFind {
    Node head = null;
    void insert(int value){
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
    void findMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println("Middle Node : " + slow.data);
        }
    }

  
    public static void main(String[] args){
        MiddleFind list = new MiddleFind();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);


        list.findMiddle();

        
    }
}
