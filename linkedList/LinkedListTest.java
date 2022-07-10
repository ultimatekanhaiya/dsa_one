class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void insertAtStart(int data) {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;

    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }

    }

    public void delete(int index) {
        Node n = head;
        Node n1;
        if (index == 0) {
            head = n.next;
        }

        else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }

    }
}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insertAtStart(12);
        list.insertAt(0, 77);
        list.delete(2);
        list.show();

    }
}
