class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Detectloop {
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
   /* boolean detectLoop(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    } 
        */
    void detectLoop(){
         Node slow = head;
        Node fast = head;
        boolean loop = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                loop = true;
                break;
            }
        }
        if(loop){
            slow = head;
            while(slow.next != fast.next){
                slow = slow.next; fast = fast.next;
            }
            fast.next = null;
            System.out.println("Loop Removed");
        }
        else{
            System.out.println("No Loop Found");
        }

    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }


    public static void main(String[] args){
        Detectloop list = new Detectloop();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.head.next.next.next.next = list.head.next.next;

        list.detectLoop(); 
        list.display();

        

   /*     
        if(!list.detectLoop()){

            System.out.println("Loop Detected in the linked list");
        }
        else{
            System.out.println("No Loop in the Linked List");
        }
    }
        */
    }
}
