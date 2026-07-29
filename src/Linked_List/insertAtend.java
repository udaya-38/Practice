package Linked_List;

public class insertAtend {

    //NODE CLASS

    static class Node {
        int val;
        Node next;

        Node (int val) {
            this.val = val;
            this.next = null;
        }
    }

    //HEAD

    Node head;

    //METHOD TO INSERT AT END OF LINKED LIST

    public void InsertAtend(int data) {
        Node newNode = new Node(data);

        //IF THE LIST IS EMPTY

        if (head == null) {
            head = newNode;
            return;
        }

        //TRAVERSE TO THE LAST NODE

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        //LINK THE LAST NODE TO NEW NODE

        temp.next = newNode;
    }

        //DISPLAY THE LINKED LIST

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.print("NULL");
        }


    public static void main(String [] args) {
        insertAtend list = new insertAtend();
        list.InsertAtend(10);
        list.InsertAtend(20);
        list.InsertAtend(30);
        list.InsertAtend(40);

        list.display();
    }
}
