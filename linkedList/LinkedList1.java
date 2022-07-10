/*
 * Reference: YouTube -> CodingSimplified = https://www.youtube.com/watch?v=dBBm5pltWe4&list=PLt4nG7RVVk1gDMcCZkpjOxZS4XMro29DU
 * Reference 2. -> https://www.sanfoundry.com/java-program-implement-singly-linked-list/
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

//Linked list code using recursion

/*
* As we need an object which can store a data + a reference both we have to
* define our own object and for that we define our Node class. Then we need to
* define our own LinkedList class which will contains all related methods to
* LinkedList. After that we just need a class to use LinkedList
*
*/

class Node1 {
    int i;// data
    Node1 next;// reference
}

class Linked {
    // method to insert node at start of LinkedList
    public Node1 insertAtStart(int i, Node1 node) {
        Node1 n = getNewNode1(i);
        n.next = node;
        node = n;
        return node;
    }

    // method to print whole LinkedList
    public void printList(Node1 node) {
        if (node == null) {
            return;
        }
        System.out.print(node.i + " ");
        printList(node.next);
    }

    // private method to create node call by insert()
    private Node1 getNewNode1(int i) {
        Node1 a = new Node1();
        a.i = i;
        a.next = null;
        return a;
    }

    // method to insert node in end of LinkedList
    public Node1 insert(int i, Node1 node) {
        if (node == null) {
            return getNewNode1(i);
        } else {
            node.next = insert(i, node.next);
        }
        return node;
    }
}

public class LinkedList1 {
    public static void main(String[] args) {
        Node1 root = null;

        Linked a = new Linked();

        root = a.insertAtStart(4, root);
        root = a.insert(12, root);
        root = a.insert(99, root);
        root = a.insert(37, root);
        root = a.insertAtStart(1, root);

        a.printList(root);

    }

}

// ? 1.Why aren't we importing LinkedList class and Node class?
// ? 2.Can we declare Node class as private inside LinkedList class?
// ? 3.Why aren't we inheriting LinkedList class in Main class?
