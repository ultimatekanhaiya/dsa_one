public class Test6 {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // insert at start of list
        void insertAtEnd(int i) {
            Node n = new Node();
            n.data = i;
            n.next = null;

            if (size == 0) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
            size++;
        }

        // display all elements in list
        void show() {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }

        }

        // return size of list
        int size() {
            return size;
        }

        // remove first element from list
        void removeFirst() {
            if (size == 0) {
                System.out.println("list is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        // remove last element from list
        void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node n = head;
                for (int i = 0; i < size - 2; i++) {
                    n = n.next;
                }
                n.next = null;
                tail = n;
                size--;
            }
        }

        // remove particular element from list
        void removeAt(int index) {
            if (index >= size) {
                System.out.println("Invalid index: " + index);
            } else if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                Node n = head;
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                n.next = n.next.next;
                size--;
            }
        }

        // get first element of list
        int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else {
                return head.data;
            }
            return -1;
        }

        // get last element of list
        int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else {
                return tail.data;
            }
            return -1;
        }

        // get element at particular index
        int getAt(int index) {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (index >= size) {
                System.out.println("Invalid index");
            } else {
                Node n = head;
                for (int i = 0; i < index; i++) {
                    n = n.next;
                }
                return n.data;
            }
            return -1;
        }

        // add at first position in list
        void addFirst(int i) {
            Node n = new Node();
            n.data = i;
            n.next = head;
            head = n;

            if (size == 0) {
                tail = n;
            }
            size++;
        }

        // add at last position in list
        void addLast(int i) {
            Node n = new Node();
            n.data = i;
            tail.next = n;
            tail = n;

            if (size == 0) {
                head = n;
            }
            size++;
        }

        // add elements at given position in list
        void addAt(int index, int data) {
            if (index > size) {
                System.out.println("Invalid index: " + index);
            } else if (index == 0) {
                addFirst(data);
            } else if (index == size) {
                addLast(data);
            } else {
                Node temp = head;
                Node n = new Node();
                n.data = data;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                n.next = temp.next;
                temp.next = n;

                size++;
            }
        }

        // retun node at particular index
        private Node getNodeAt(int index) {
            Node n = head;
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
            return n;
        }

        // reverse a linkedList
        void reverse() {
            int lt = 0;
            int rt = size - 1;
            while (lt < rt) {
                Node left = getNodeAt(lt);
                Node right = getNodeAt(rt);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                lt++;
                rt--;
            }
        }

        // reverse pointer/link of list itratively
        void reversePI() {
            Node pre = null;
            Node cur = head;
            while (cur != null) {
                Node newcur = cur.next;
                cur.next = pre;
                pre = cur;
                cur = newcur;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(12);
        list.insertAtEnd(41);
        list.insertAtEnd(18);
        list.insertAtEnd(61);
        list.show();
    }
}
