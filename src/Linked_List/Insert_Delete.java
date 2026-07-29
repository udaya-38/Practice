package Linked_List;

public class Insert_Delete {
    Node head;
    Node tail;
    int size;


    public void insertFirst (int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public int deleteFirst () {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast(int i) {
        if (size <= 1) {
            deleteFirst();
        }

        Node secLast = getIndex(size - 2);
        int val = tail.val;
        tail = secLast;
        tail.next = null;
        return val;
    }

    public int deleteIndex (int index) {
        if (index == 0) {
            deleteFirst();
        }

        if (index == size - 1) {
            deleteLast(2);
        }

        Node prev = getIndex(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }
    public void insertLast (int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex (int val , int index) {

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1 ; i < index ; i++) {
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;
    }

    Node getIndex (int index) {
        Node node = head;
        for (int i = 0 ; i < index ; i++) {
            node = node.next;
        }

        return node;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String [] args) {

        Insert_Delete list = new Insert_Delete();
        //INSERT_FIRST

        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(8);

        //INSERT_LAST

        list.insertLast(4);
        list.insertLast(7);
        list.insertLast(9);

        //INSERT_INDEX

        list.insertIndex(10 , 2);

        //GET_INDEX

        System.out.println(list.getIndex(6).val);

        //DELETE_FIRST

        list.deleteFirst();

        //DELETE_LAST

        list.deleteLast(7);

        //DELETE_INDEX

        list.deleteIndex(3);

        list.display();
    }
}

class Node {
    int val;
    Node next;

    Node (int val) {
        this.val = val;
    }

    Node (int val , Node next) {
        this.val = val;
        this.next = next;
    }
}


